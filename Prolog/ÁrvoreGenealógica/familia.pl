    progenitor(terezinha, lizandro).
    progenitor(ivan, lizandro).
    progenitor(terezinha, ivanize).
    progenitor(ivan, ivanize).
    progenitor(lizandro, evandro).
    progenitor(virginia, evandro).
    progenitor(ivanize, isadora).
    progenitor(elton, isadora).
    homem(lizandro).
    homem(ivan).
    homem(evandro).
    homem(elton).

    mulher(terezinha).
    mulher(ivanize).
    mulher(virginia).
    mulher(isadora).

    %se o progenitor for homem, então é pai
    pai(X,Y) :- progenitor(X,Y), homem(X).
    %caso seja mulher, então, mãe
    mae(X,Y) :- progenitor(X,Y), mulher(X).

    %define a relação de geração
    gerou(X,Y) :- pai(X,Y); mae(X,Y).

    %se gerou um homem, então filho
    filho(X,Y) :- gerou(Y,X), homem(X).
    %se gerou uma mulher, então filha
    filha(X,Y) :- gerou(Y,X), mulher(X).

    %se existir relação e for homem, então irmao
    irmao(X,Y) :- gerou(Z,X), gerou(Z,Y), homem(X), X\==Y.
    %se existir relação e for mulher então irmã
    irma(X,Y) :- gerou(Z,X), gerou(Z,Y), mulher(X), X\==Y.

    %se são filhos do mesmo progenitor e são irmãos, então serão tios as
    tio(X,Y) :- irmao(X,Z), progenitor(Z,Y).
    tia(X,Y) :- irma(X,Z), progenitor(Z,Y).

    %se tio, então terá sobrinhos as
    sobrinho(X,Y) :- homem(X), tio(Y,X); homem(X), tia(Y,X).
    sobrinha(X,Y) :- mulher(X), tio(Y,X); mulher(X), tia(Y,X).

    %se tia e tio geraram um filho homem, então primo
    primo(X,Y) :- tia(Z,X), gerou(Z,Y), homem(X); tio(Z,X), gerou(Z,Y), homem(X).
    %se tia e tio geraram uma filha mulher, então prima
    prima(X,Y) :- tia(Z,X), gerou(Z,Y), mulher(X); tio(Z,X), gerou(Z,Y), mulher(X).

    %se gerou pai e filho a, e é homem então avô
    avô(X,Y) :- gerou(X,Z), gerou(Z,Y), homem(X).
    %se gerou pai e filho a, e é mulher então avó
    avó(X,Y) :- gerou(X,Z), gerou(Z,Y), mulher(X).

    %se os dois geraram o mesmo filho, então são casados
    casados(X,Y) :- gerou(X,Z), gerou(Y,Z), X\==Y.