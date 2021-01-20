inserir_lista_ordenada(_,  X, [],     [X]).
inserir_lista_ordenada(Op, X, [Y|Ys], Resultado) :-
  (   call(Op, X, Y) ->
      Resultado = [X, Y|Ys]
  ;   inserir_lista_ordenada(Op, X, Ys, Zs),
      Resultado = [Y|Zs]
  ).

separar_par_impar([], [], []).
separar_par_impar([X|Xs], Par, Impar) :-
    separar_par_impar(Xs, Par0, Impar0),
    (   0 is X mod 2 ->
        inserir_lista_ordenada(>, X, Par0, Par),
        Impar = Impar0
    ;   inserir_lista_ordenada(<, X, Impar0, Impar),
        Par = Par0
    ).