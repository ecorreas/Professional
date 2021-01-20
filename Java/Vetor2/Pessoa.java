public class Pessoa implements Comparable<Pessoa>{
        
        private String nome;
        private int idade;
        
        public Pessoa(String name, int age){
            nome = name;
            idade = age;
        }
        
        public String getNome(){
            return nome;
        }

        public int getIdade(){
            return idade;
        }

        public void setNome(String name){
            nome = name;
        }

        public void setIdade(int age){
            idade = age;
        }
        
        public int compareTo(Pessoa p){
            int i = this.nome.compareTo(p.getNome());
            if(i != 0){
                return i;
            }
            if(idade < p.getIdade()){
                return -1;
            }
            else if (idade == p.getIdade()){
                return 0;
            }
            else{	
                return 1;
            }
        }
        
        public String toString(){
            return "("+nome + ", "+ idade + ")";
        }
}
