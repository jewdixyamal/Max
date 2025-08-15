package one.me.chatscreen.mediabar.permission;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/chatscreen/mediabar/permission/MediaBarPermissionWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "()V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MediaBarPermissionWidget extends Widget {
    public static final /* synthetic */ bc7[] Z;
    public final qm0 X;
    public final qm0 Y;
    public final je7 a;
    public final je7 b;
    public final qm0 c;
    public final qm0 o;

    static {
        Class<MediaBarPermissionWidget> cls = MediaBarPermissionWidget.class;
        hob hob = new hob(cls, "noCameraPermissionContent", "getNoCameraPermissionContent()Landroid/widget/LinearLayout;", 0);
        oec oec = nec.a;
        Z = new bc7[]{hob, zr6.e(oec, cls, "cameraContent", "getCameraContent()Landroid/widget/FrameLayout;", 0), zr6.f(cls, "permissionContent", "getPermissionContent()Landroid/widget/LinearLayout;", 0, oec)};
    }

    public MediaBarPermissionWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = fua.a.b();
        this.b = createViewModelLazy(l48.class, new nj4(20, new m57(25)));
        this.c = binding(new m48(this, 0));
        this.o = binding(new m48(this, 1));
        this.X = binding(new m48(this, 2));
        this.Y = binding(new m48(this, 3));
    }

    public final void m0() {
        je7 je7 = this.a;
        if (((eua) je7.getValue()).b(eua.l)) {
            ((eua) je7.getValue()).f(new l5g(this, 1), eua.m, 157);
        } else {
            ((eua) je7.getValue()).f(new l5g(this, 1), eua.n, 162);
        }
    }

    public final void onActivityResumed(Activity activity) {
        ((l48) this.b.getValue()).b.h();
        super.onActivityResumed(activity);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        bc7[] bc7Arr = Z;
        bc7 bc7 = bc7Arr[1];
        linearLayout.addView((FrameLayout) this.X.getValue());
        bc7 bc72 = bc7Arr[2];
        linearLayout.addView((LinearLayout) this.Y.getValue());
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        qm0 qm0 = this.o;
        if (qm0.a()) {
            ((hv1) qm0.getValue()).c();
        }
        super.onDestroyView(view);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        je7 je7 = this.a;
        int i2 = 0;
        if (i == 157) {
            int length = iArr.length;
            while (i2 < length) {
                if (iArr[i2] == -1) {
                    i2++;
                } else {
                    return;
                }
            }
            l5g l5g = new l5g(this, 1);
            int i3 = u8a.Q;
            int i4 = u8a.P;
            ((eua) je7.getValue()).getClass();
            eua.j(l5g, strArr, iArr, i3, i4);
        } else if (i == 162) {
            int length2 = iArr.length;
            while (i2 < length2) {
                if (iArr[i2] == -1) {
                    i2++;
                } else {
                    return;
                }
            }
            boolean unused = ((eua) je7.getValue()).getClass();
        }
    }

    public MediaBarPermissionWidget() {
        this(new Bundle(0));
    }
}
