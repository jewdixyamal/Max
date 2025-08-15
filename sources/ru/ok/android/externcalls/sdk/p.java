package ru.ok.android.externcalls.sdk;

import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

public final /* synthetic */ class p implements qj3, StereoRoomManagerImpl.GrantRolesRequest {
    public final /* synthetic */ ConversationImpl a;

    public /* synthetic */ p(ConversationImpl conversationImpl) {
        this.a = conversationImpl;
    }

    public void accept(Object obj) {
        this.a.lambda$addParticipant$29((Throwable) obj);
    }

    public void grantRoles(bg1 bg1, boolean z, eg1[] eg1Arr, Runnable runnable, Runnable runnable2) {
        this.a.grantRoles(bg1, z, eg1Arr, runnable, runnable2);
    }
}
