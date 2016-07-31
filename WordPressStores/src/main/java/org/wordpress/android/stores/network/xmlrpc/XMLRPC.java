package org.wordpress.android.stores.network.xmlrpc;

public enum XMLRPC {
    // Media
    GET_MEDIA_LIBRARY("wp.getMediaLibrary"),
    GET_MEDIA_ITEM("wp.getMediaItem"),
    EDIT_MEDIA("wp.editPost"),
    DELETE_MEDIA("wp.deletePost"),
    UPLOAD_FILE("wp.uploadFile"),

    GET_OPTIONS("wp.getOptions"),
    GET_USERS_BLOGS("wp.getUsersBlogs"),
    LIST_METHODS("system.listMethods");

    private final String mEndpoint;

    XMLRPC(String endpoint) {
        mEndpoint = endpoint;
    }

    @Override
    public String toString() {
        return mEndpoint;
    }
}
