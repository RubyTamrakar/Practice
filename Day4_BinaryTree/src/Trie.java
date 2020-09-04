import java.util.HashMap;

    public class Trie{
        Node root;
        private class Node {
//            Node charNode;
            private char value;
            private HashMap<Character, Node> children = new HashMap<>();
            private boolean terminate;

            @Override
            public String toString() {
                return "Node{" +
                        "value=" + value +
                        ", children=" + children +
                        ", terminate=" + terminate +
                        '}';
            }

            private void insert(String word){
//                System.out.println(word);
                if (word== null || word.length()==0) return;

                char firstChar = word.charAt(0);

//                System.out.println(firstChar);
              Node  charNode= this.children.get(firstChar);

                if(charNode==null){

                charNode = new Node ();
                charNode.value=firstChar;
                    this.children.put(firstChar, charNode);

                }

                if (word.length()>0){
                    insert(word.substring(1));
                }else{
                    charNode.terminate = true;
                }
            }
            public Node(){
                this.value = value;
                this.terminate=false;
            }


        }

        public Trie() {
            this.root = new Node();
        }

        public void insert(String word){
            this.root.insert(word);
        }

        @Override
        public String toString() {
            return "Trie{" +
                    "root=" + root +
                    '}';
        }
    }
