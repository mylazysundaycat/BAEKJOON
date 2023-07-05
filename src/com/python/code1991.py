class Node():
    def __init__(self, data, pre, next):
        self.data = data
        self.pre = pre
        self.next = next


num = int(input())
binary_tree_dic = {}

for i in range(num):
    str_list = input().split()
    binary_tree_dic[str_list[0]] = Node(str_list[0],str_list[1],str_list[2])

root = binary_tree_dic['A']

def preorder(root):
    print(root.data,end='')
    if root.pre != '.':
        preorder(binary_tree_dic[root.pre])
    if root.next != '.':
        preorder(binary_tree_dic[root.next])

def inorder(root):
    if root.pre != '.':
        inorder(binary_tree_dic[root.pre])
    print(root.data,end='')
    if root.next != '.':
        inorder(binary_tree_dic[root.next])

def postorder(root):
    if root.pre != '.':
        postorder(binary_tree_dic[root.pre])
    if root.next != '.':
        postorder(binary_tree_dic[root.next])
    print(root.data,end='')

preorder(root)
inorder(root)
postorder(root)

