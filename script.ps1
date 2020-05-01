$a = read-host "Please type 'approve', if you want the deployment to continue"

while ($a -ne 'approve'){
    $a = read-host "Please type 'approve', if you want the deployment to continue"
}