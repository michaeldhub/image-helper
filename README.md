# Image-helper

## Github repository
    
    https://github.com/michaeldhub/image-helper.git
    
## …or create a new repository on the command line

    echo "# image-helper" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/michaeldhub/image-helper.git
    git push -u origin main
    
## …or push an existing repository from the command line

    git remote add origin https://github.com/michaeldhub/image-helper.git
    git branch -M main
    git push -u origin main
    
## …or import code from another repository

You can initialize this repository with code from a Subversion, Mercurial, or TFS project.

## Warnings

    hint: Using 'master' as the name for the initial branch. This default branch name
    hint: is subject to change. To configure the initial branch name to use in all
    hint: of your new repositories, which will suppress this warning, call:
    hint: 
    hint:   git config --global init.defaultBranch <name>
    hint: 
    hint: Names commonly chosen instead of 'master' are 'main', 'trunk' and
    hint: 'development'. The just-created branch can be renamed via this command:
    hint: 
    hint:   git branch -m <name>
    
    hint: Pulling without specifying how to reconcile divergent branches is
    hint: discouraged. You can squelch this message by running one of the following
    hint: commands sometime before your next pull:
    hint: 
    hint:   git config pull.rebase false  # merge (the default strategy)
    hint:   git config pull.rebase true   # rebase
    hint:   git config pull.ff only       # fast-forward only
    hint: 
    hint: You can replace "git config" with "git config --global" to set a default
    hint: preference for all repositories. You can also pass --rebase, --no-rebase,
    hint: or --ff-only on the command line to override the configured default per
    hint: invocation.

## Build

    mvn clean package deploy

    
