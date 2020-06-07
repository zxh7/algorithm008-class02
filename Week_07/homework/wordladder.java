class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet=new HashSet<>(wordList);
        if(wordSet.size()==0)return 0;
        wordSet.remove(beginWord);
        Queue<String> queue=new LinkedList<>();
        queue.offer(beginWord);
        Set<String> visited=new HashSet<>();
        visited.add(beginWord);
        int step=1;
        int len=beginWord.length();
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                String word=queue.poll();
                char[] charArray=word.toCharArray();
                for(int j=0;j<len;j++){
                    char originChar = charArray[j];
                    for (char k = 'a'; k <= 'z'; k++) {
                        if (k == originChar) {
                            continue;
                        }
                        charArray[j] = k;
                        String nextWord = String.valueOf(charArray);
                        if (wordSet.contains(nextWord)) {
                            if (nextWord.equals(endWord)) {
                                return step + 1;
                            }
                            if (!visited.contains(nextWord)) {
                                queue.add(nextWord);
                                visited.add(nextWord);
                            }
                        }                    
                        charArray[j]=originChar;
                    }
                }                
            }step++;
        }
        return 0;
    }
}