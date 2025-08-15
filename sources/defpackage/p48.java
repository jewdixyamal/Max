package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;

/* renamed from: p48  reason: default package */
public final class p48 extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ MediaBarPermissionWidget Y;
    public final /* synthetic */ FrameLayout Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p48(MediaBarPermissionWidget mediaBarPermissionWidget, FrameLayout frameLayout, Continuation continuation) {
        super(2, continuation);
        this.Y = mediaBarPermissionWidget;
        this.Z = frameLayout;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        e5f e5f = e5f.a;
        ((p48) n(bool, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p48 p48 = new p48(this.Y, this.Z, continuation);
        p48.X = ((Boolean) obj).booleanValue();
        return p48;
    }

    public final Object o(Object obj) {
        View view;
        od2.a0(obj);
        boolean z = this.X;
        MediaBarPermissionWidget mediaBarPermissionWidget = this.Y;
        if (z) {
            view = ((hv1) mediaBarPermissionWidget.o.getValue()).getRootView();
            tu0.K(view, 300, new n48(mediaBarPermissionWidget, 2));
        } else {
            bc7[] bc7Arr = MediaBarPermissionWidget.Z;
            mediaBarPermissionWidget.getClass();
            bc7 bc7 = MediaBarPermissionWidget.Z[0];
            view = (LinearLayout) mediaBarPermissionWidget.c.getValue();
        }
        FrameLayout frameLayout = this.Z;
        frameLayout.removeAllViews();
        frameLayout.addView(view);
        return e5f.a;
    }
}
