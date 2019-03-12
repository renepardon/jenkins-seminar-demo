#!/usr/bin/env groovy
def getBranchName() {
    // return env.BRANCH_NAME
        println "Super"
}

/**
 * @return the part of the branch name after the slash
 */
def getSimpleBranchName() {
    return getBranchName().substring(getBranchName().lastIndexOf('/') + 1)
}

/**
 * @return the branch name splitted with dashes instead of slashes
 */
def getDashedBranchName() {
    return getBranchName().replace("/", "-")
}
return this;
