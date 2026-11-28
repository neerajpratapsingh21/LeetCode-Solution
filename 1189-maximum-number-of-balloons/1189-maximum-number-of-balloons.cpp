class Solution {
public:
    int maxNumberOfBalloons(string text) {
        unordered_map<char,int> have;
        for(int i = 0; i < text.size(); i++){
            have[text[i]]++;
        }
      unordered_map<char,int> need;
       need['b']=1;
       need['a']=1;
       need['l']=2;
       need['o']=2;
       need['n']=1;
        
    string s = "balon";
    int res = 100000;
    for(int i = 0; i < 5; i++){
      res = min(have[s[i]]/need[s[i]],res);
    }
    return res;
    }
};