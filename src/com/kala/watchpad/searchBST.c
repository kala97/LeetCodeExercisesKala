/* 递归查找二叉排序树T中是否存在key, */
/* 指针f指向T的双亲，其初始调用值为NULL */
/* 若查找成功，则指针p指向该数据元素结点，并
   返回TRUE */
/* 否则指针p指向查找路径上访问的最后一个结点
   并返回FALSE */
Status SearchBST(BiTree T, int key, BiTree f, BiTree *p)
{
    /* 查找不成功 */
    if (!T)
    {
        *p = f;
        return FALSE;
    }
    /* 查找成功 */
    else if (key == T->data)
    {
       *p = T;
       return TRUE;
    }
    else if (key < T->data)
        /* 在左子树继续查找 */
        return SearchBST(T->lchild, key, T, p);
    else
        /* 在右子树继续查找 */
        return SearchBST(T->rchild, key, T, p);
}