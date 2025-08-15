package defpackage;

import android.view.View;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;

/* renamed from: n48  reason: default package */
public final /* synthetic */ class n48 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarPermissionWidget b;

    public /* synthetic */ n48(MediaBarPermissionWidget mediaBarPermissionWidget, int i) {
        this.a = i;
        this.b = mediaBarPermissionWidget;
    }

    public final void onClick(View view) {
        MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = MediaBarPermissionWidget.Z;
                mediaBarPermissionWidget.m0();
                return;
            case 1:
                bc7[] bc7Arr2 = MediaBarPermissionWidget.Z;
                mediaBarPermissionWidget.m0();
                return;
            default:
                bc7[] bc7Arr3 = MediaBarPermissionWidget.Z;
                mediaBarPermissionWidget.m0();
                return;
        }
    }
}
