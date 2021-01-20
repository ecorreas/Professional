module Main where

import System.IO

type Nota = (String, [Double])
nota nome nota1 nota2 = (nome, [nota1, nota2])
notaVazia = nota "" 0 0

-- recebe uma entrada do teclado e retorna a string digitada no teclado
input msg = do
    putStr msg
    hFlush stdout
    getLine

--recebe uma string e converte para um float
inputFloat msg = do
    valorOri <- input msg
    let val = read valorOri :: Double
    return val

-- recebe o nome do aluno e as notas, caso o nome seja vazio, retornará uma nota vazia
lerNota :: IO Nota
lerNota = do
    nome <- input "Nome do aluno: "
    if nome == ""
        then return notaVazia
        else do
            nota1 <- inputFloat "Nota 1: "
            nota2 <- inputFloat "Nota 2: "
            return $ nota nome nota1 nota2

-- recebe várias notas recursivamente
lerNotas :: IO [Nota]
lerNotas = do
    nota <- lerNota
    if nota == notaVazia
        then return []
        else do
            notas <- lerNotas
            return $ nota:notas

-- exibe a média caso o aluno seja encontrado
exibirMedia nome notas = do
    let maybeValues = lookup nome notas
    case maybeValues of
        Nothing -> putStrLn $ "Aluno \"" ++ nome ++ "\" não encontrado"
        Just [nota1, nota2] -> do
            let media = (nota1 + nota2) / 2
            putStrLn $ "Média: " ++ (show media)
    putStrLn ""


exibirMedias notas = do
    nome <- input "Digite o nome do aluno que deseja procurar: "
    if nome == ""
        then putStrLn "Saindo..."
        else do
            exibirMedia nome notas
            exibirMedias notas
            

main = do
    notas <- lerNotas
    putStrLn ""
    putStrLn "Entrada de dados finalizada. Você agora pode procurar por uma média."
    putStrLn ""
    exibirMedias notas
