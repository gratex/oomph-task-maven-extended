#!/bin/bash

set -o errexit
#set -x

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

NEXT_VERSION=$(git tag -l *.*.* | sort -t'.' -k3rn -k2rn | head -1 | gawk -F"." '{$NF+=1}{print $0RT}' OFS="." ORS="")

read -p "Release version: " -e -i "$NEXT_VERSION" VERSION

if [[ -z $VERSION ]]; then
    >&2 echo "Provide release version"
    exit 1
fi

if [[ -n $(git status --porcelain) ]]; then
    >&2 echo "Repo is dirty, commit your changes before release"
    exit 1
fi

git pull --rebase

# build
$DIR/run

git tag "$VERSION"
git push --all

pushd $DIR/../oomph-task-maven-extended-gh-pages
{
    git reset HEAD --hard
    git clean -dfx
    git pull
    mkdir -p repository
    rm -rf repository/*
    cp -r $DIR/com.gratex.oomph.task.maven.site/target/repository/* repository/
    git add -A
    git commit -m "release $VERSION"
    git tag -a -m "release $VERSION" "$VERSION"
    git push --all
} && {
    popd
}

