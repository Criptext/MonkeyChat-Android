package com.criptext.comunication

/**
 * Created by gesuwall on 6/2/16.
 */

enum class CBTypes {
    onMessageReceived, onAcknowledgeReceived, onSocketConnected, onSocketDisconnected,
    onDeleteReceived, onCreateGroup, onRemoveGroupMember, onAddGroupMember, onGetUserInfo, onGetUsersInfo,
    onGetGroupInfo, onGetConversations, onDeleteConversation, onGetConversationMessages, onFileDownloadFinished,
    onUpdateUserData, onUpdateGroupData, onContactOpenMyConversation, onNotificationReceived, onSyncComplete,
    onMessageFailDecrypt, onGroupAdded, onGroupNewMember, onGroupRemovedMember, onFileFailsUpload,
    onConversationOpenResponse, onConnectionRefused
}