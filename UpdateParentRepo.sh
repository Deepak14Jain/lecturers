cd $(git rev-parse --show-superproject-working-tree)
git submodule update --init --recursive --remote
git add .
git commit -m "Updating Parent Repo"
git push