/* 当二叉排序树T中不存在关键字等于key的数据元素时， */
/* 插入key并返回TRUE，否则返回FALSE */
Status InsertBST(BiTree *T, int key)
{
    BiTree p, s;
    /* 查找不成功 */
    if (!SearchBST(*T, key, NULL, &p))
    {
        s = (BiTree)malloc(sizeof(BiTNode));
        s->data = key;
        s->lchild = s->rchild = NULL;
        if (!p)
            /* 插入s为新的根结点 */
            *T = s;
        else if (key < p->data)
            /* 插入s为左孩子 */
            p->lchild = s;
        else
            /* 插入s为右孩子 */
            p->rchild = s;
        return TRUE;
    }
    else
        /* 树中已有关键字相同的结点，不再插入 */
        return FALSE;
}