node {

   def registryProjet='brisset/'
  

    stage('Clone') {
          checkout scm
    }

    stage('Push') {
    docker.withRegistry('https://index.docker.io/v1/' , 'hub_docker_id') {   
         sh 'apk update'
         sh  'apk add docker-compose'
         sh 'docker-compose up -d'
         sh'docker ps'

         }
    }

}
