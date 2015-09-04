PreOrderS = ""
InOrderS = ""
class TreeNode:
	def __init__(self,key):
		self.key = key
		self.left = None
		self.right = None
		self.p = None

	def __str__(self):
		return str(self.key)
def PreOrder(n):
	PreOrderS = ""
	PreOrderS+=n.data
	
def PreOrderHelper(n):
	PreOrderS+=n.data	
	if (n.left == None):
		PreOrderS+="0"
	else
		PreOrder(n.left)
	if (n.right == None):
		PreOrderS+="0"
	else
		PreOrder(n.right)
def InOrder(n):
	if(n.left == None):
		InOrderS+="0"
	else
		InOrder(n.left)
	InOrderS+=n.data
	if(n.right == None):
		InOrderS+="0"
	else
		InOrder(n.right)

def Compare(t1,t2):
	PreOrder(t1)
#Create the Trees here, call them t1, t2

def 


