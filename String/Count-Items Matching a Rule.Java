class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;

        if(Objects.equals(ruleKey, "type")){
            for(int i=0; i<items.size(); i++){
                if(Objects.equals(items.get(i).get(0), ruleValue)){
                    count++;
                }
            }

        }else if(Objects.equals(ruleKey, "color")){
            for(int i=0; i<items.size(); i++){
                if(Objects.equals(items.get(i).get(1), ruleValue)){
                    count++;
                }
            }
        }else{
            for(int i=0; i<items.size(); i++){
                if(Objects.equals(items.get(i).get(2), ruleValue)){
                    count++;
                }
            }
        }
        return count;

    }
}