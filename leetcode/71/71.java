//ry

class Solution {
    public String simplifyPath(String path) {
        String[] tmp = path.split("/");
        List<String> res = new ArrayList<>();
        for(String s : tmp) {
            if(s.compareTo("") == 0 || s.compareTo(".") == 0) continue;
            if(s.compareTo("..") == 0) {
                if(res.size() > 0) 
                    res.remove(res.size() - 1);
                else continue;
            }
            else res.add(s);
        }
        if(res.size() == 0) return "/";
        StringBuilder sb = new StringBuilder();
        for(String s : res) sb.append("/" + s);
        return sb.toString();
    }
}
