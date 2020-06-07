###学习笔记<hr>
###字典树<hr>
应用场景：搜索引擎搜索关键词提示功能。<br>
定义：一种树形结构，用来处理字符串匹配。本质就是利用字符串之间的公共前缀，将重复的前缀合并到一起。<br>
![字典树](https://static001.geekbang.org/resource/image/28/32/280fbc0bfdef8380fcb632af39e84b32.jpg)

### 双向bfs代码模版<br>

```Set<String> start=new HashSet<>();
Set<String> end=new HashSet<>();
bfs(...);
bfd(){
    if(){
        start.size()>end.size();
        return;
    }
    for(){
        process;
    }	
}
```

### 红黑树<hr>
近似平衡二叉搜索树：<br>
1. 节点是红色或者黑色。<br>
2. 根节点是黑色。<br>
3. 每个叶子的节点都是黑色的空节点。<br>
4. 每个红色节点的两个子节点都是黑色的。<br>
5. 从任意节点到其每个叶子的所有路径都包含相同的黑色节点。<br>

