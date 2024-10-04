argocd app create ms-helm \
--repo https://github.com/alxss01/ms-helm.git \
--path k8s \
--project default \
--dest-server https://kubernetes.default.svc \
--dest-namespace helm \
--sync-policy automated
