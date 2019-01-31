colorscheme darkblue
syntax on
filetype indent on
set ts=2
set number
set incsearch
set cursorline
set showmatch
set formatoptions+=r
set colorcolumn=80
autocmd BufWritePre * :%s/\s\+$//e
