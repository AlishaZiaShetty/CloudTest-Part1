# CloudTest-Part1
Create K8 cluster
Install Docker
Download Zalenium Hub
In the UI based test automation code , add the link to Zakenium hub'

Capabilities:
Takes the TestNg command and runs the test scripts on specified browsers 
Provides parallel processing
No overhead of configuring log , screenshots 
Captures video of the execution

Pending work :
Set up CICD pipeline
Incude the test for database validation
Include the test for API 


Create a Cluster with few nodes configured

gcloud container clusters get-credentials zalenium --zone us-central1-c --project third-serenity-343114

kubectl create namespace zalenium

helm repo add zalenium-github https://raw.githubusercontent.com/zalando/zalenium/master/charts/zalenium
helm install my-release --namespace zalenium zalenium-github/zalenium --set hub.serviceType="LoadBalancer" --set hub.basicAuth.enabled="true" --set hub.basicAuth.username="alishazia" --set hub.basicAuth.password="Zalenium2022"
kubectl get service my-release-zalenium --namespace="zalenium"

35.222.57.254
Zalenium Dashboard → http://35.222.57.254/dashboard/#
Zalenium live preview → http://35.222.57.254/grid/admin/live
Zalenium  Grid Console →http://35.222.57.254/grid/console
Zalenium Hub → http://35.222.57.254/wd/hub	
