package snippet;

public class Snippet {
	int j;
	cin >> j;
	DeleteAdjList(G.vertices[j - 1]);
	for (int i = j - 1; i < G.vexnum - 1; i++) {
	    G.vertices[i] = G.vertices[i + 1];
	}
	G.vexnum--; // 更新顶点数
	for (int i = 0; i < G.vexnum; i++) {
	    ArcNode* cur = G.vertices[i].firstarc;
	    ArcNode* pre = NULL;
	    while (cur != NULL && cur->data != j) {
	        pre = cur;
	        cur = cur->nextarc;
	    }
	    if (cur != NULL) { // 判断是否找到了要删除的边
	        if (pre == NULL) {
	            G.vertices[i].firstarc = cur->nextarc;
	        }
	        else {
	            pre->nextarc = cur->nextarc;
	        }
	        delete cur; // 释放被删除边的空间
	    }
	}
	return OK;
}
	int j;
	cin >> j;
	DeleteAdjList(G.vertices[j - 1]);
	for (int i = j - 1; i < G.vexnum - 1; i++) {
	    G.vertices[i] = G.vertices[i + 1];
	}
	G.vexnum--; // 更新顶点数
	for (int i = 0; i < G.vexnum; i++) {
	    ArcNode* cur = G.vertices[i].firstarc;
	    ArcNode* pre = NULL;
	    while (cur != NULL && cur->data != j) {
	        pre = cur;
	        cur = cur->nextarc;
	    }
	    if (cur != NULL) { // 判断是否找到了要删除的边
	        if (pre == NULL) {
	            G.vertices[i].firstarc = cur->nextarc;
	        }
	        else {
	            pre->nextarc = cur->nextarc;
	        }
	        delete cur; // 释放被删除边的空间
	    }
	}
	return OK;

