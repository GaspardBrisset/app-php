node {

   def registryProjet='brisset/'
  

    stage('Clone') {
          checkout scm
    }

 
/*
    stage('Run') {
          img.withRun("--name run-$BUILD_ID -p 8000:80") { c ->
       
          }
    }*/

    stage('Push') {
    docker.withRegistry('https://index.docker.io/v1/' , 'hub_docker_id') {
         sh "docker "
       echo "test"
    }

}
