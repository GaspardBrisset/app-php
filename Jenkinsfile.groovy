node {

   def registryProjet='brisset/'
  

    stage('Clone') {
          checkout scm
    }

    stage('Push') {
         sh 'apk update'
         sh  'apk add docker-compose'
         sh 'docker-compose up -d'
         sh'docker ps'

     }
    

}
