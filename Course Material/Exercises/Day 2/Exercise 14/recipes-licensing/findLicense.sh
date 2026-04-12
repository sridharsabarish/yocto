#! /bin/bash



cd ~/git/poky/build/tmp/deploy/licenses

echo "finding the licenses for $1" 
find . -name "*.*" | grep $1 | awk -F'/' '{print $3}'

cd -
