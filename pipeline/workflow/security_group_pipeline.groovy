node('master') {
  stage("Commit")
    sh("ps -p \$\$")
    sh("echo \$0")
    sh("which ruby")
    sh("gem environment")
    sh("gem list")
    sh("pipeline/script/test.sh")
    sh("cfndsl --help")
  stage("Acceptance")
    try {
      sh("echo hello1")
    } catch(err) {
      sh("echo goodbye1")
    }
  stage("Capacity")
    try {
      sh("echo hello2")
    } catch(err) {
      sh("echo goodbye2")
    }
  stage("Exploratory")
    try {
      sh("echo hello3")
    } catch(err) {
      sh("echo goodbye3")
    }
  stage("Production")
    try {
      sh("echo hello4")
    } catch(err) {
      sh("echo goodbye4")
    }
}