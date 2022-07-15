def Build()
    {
        sh "docker build -t ${dockerImageName}"
        echo "Image Got Build ${dockerImageName}"
    }



def dockerPush()
    {
        sh "eval `aws ecr get-login | sed 's/-e none//g'`"
        echo "Pushing images to docker repo"
        sh "docker push ${dockerImageName}"
        echo "Pushed to ${dockerImageName}"
        sh "docker rmi ${dockerImageName}"
    }
