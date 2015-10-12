class UserMaster:
	#look into this
	def _init_(self):

	def addUser(self,fromUser,s):
		self.toUser = usersByAccountName.get(toAccountName)
		req = AddRequest(fromUser,toUser,new Date())
		self.toUser.recivedAddRequest(req)
		self.fromUser.sentAddRequest(req)

	def approveAddRequest(self,req):
		req.status = RequestStatus.Accepted
		self.from = req.getFromUser()
		self.to = req.getToUser()
		self.from.addContact(to)
		self.to.addContact(from)

	def rejectAddRequest(self,req):
		req.status = RequestStatus.Rejected
		self.from = req.getFromUser()
		self.to = req.getToUser()
		self.from.removeAddRequest(req)
		self.to.removeAddRequest(req)
	
	def userSignedOn(self,accountName):
		user = usersByAccountName.get(accountName)
		if (user is not None):
			#needs changing
			user.setStatus(UserStatus(UserStatusType.Available))
			self.onlineUsers.put(user.getId(),user)
	
	def userSignedOff(self,accountName):
		user = usersByAccountName.get(accountName)
		if (user is not None):
			#same here
			user.setSTatus(new UserStatus(UserStatusType.Offline))
			self.onlineUsers.remove(user.getID())

class User:
	#of course we still need to look into this
	def _init(self, id, accountName, fullName):
		self.accontName = accoutName
		self.fullName = fullName
		self.id = id
	
	def sendMessageToUser(self,toUser, content):
		chat = privateChats.get(toUser.getId())
		if (chat is None):
			chat = PrivateChat(this,toUser)
			privateChats.put(toUser.getId(),chat)
		message = Message(content,Date())
		return chat.addMessage(message)

	def sendMessageToGroupChat(self, groupId,content):
		chat = groupChats.get(groupId)
		if (chat is not None):
			message = Message(content,Date())
			return chat.addMessage(message)
		return false
	
	def setStatus(self,status):
		self.status = status
	
	def getStatus(self):
		return self.status

	def addContact(user):
		#If we already have this user
		if (contacts.containsKey(user.getId())):
			return False
		else:
			contacts.put(user.getId(),user)
			return True
	
	def receivedAddRequest(self,req):
		senderId = req.getFromUser().getId()
		if( not self.receivedAddRequests.containsKey(senderId):
			self.receivedAddRequests.put(senderId,req)
	
	def sentAddRequest(self,req):
		receiverId = req.getFromUser().getId()
		if( not self.sentAddRequest.containsKey(receiverId)):
			self.sentAddRequests.pu(receiverId,req)
	
	def removeAddRequest(self,req):
		if(req.getToUser() == self):
			self.receivedAddRequests.remove(req)
		elif(req.getFromUser() == self):
			sentAddRequests.remove(req)
	
	def requestAddUser(self,accountName):
		#look into this.
		self.UserMaster.getInstance().addUser(self,accountName)

	def addConversation(self,conversation):
		#there is a problem here
		if(type(conversation) == PrivateChat):
			otherUser = conversation.getOtherParticipant(self)
			self.privateChats.put(otherUser.getId(),conversation)
		elif(type(converation) == GroupChat):
			self.groupChats.add(converation)

	def getId(self):
		return self.id;
	
	def getAccountName(self):
		return self.accountName
	
	def getFullName(self):
		return self.fullName

	



	



