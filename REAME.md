# Example maven / travis / code coverage

Sample Java example using maven for building and add travis integration

## Usage

Needs maven 3

mvn clean install site:site

will compile, unit test, create a Jar package and generate site for checkstyle, javadoc etc....

The .travis.yml will be used by travis to build with multiple jdk and send code coverage report to coveralls.io

## Code coverage

[![Coverage Status](https://coveralls.io/repos/osallou/maven-example-travis/badge.svg?branch=master&service=github)](https://coveralls.io/github/osallou/maven-example-travis?branch=master)