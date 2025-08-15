package defpackage;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: j68  reason: default package */
public final class j68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ LinearLayout Y;
    public final /* synthetic */ MediaBarWidget Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j68(Continuation continuation, LinearLayout linearLayout, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = linearLayout;
        this.Z = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((j68) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j68 j68 = new j68(continuation, this.Y, this.Z);
        j68.X = obj;
        return j68;
    }

    public final Object o(Object obj) {
        u4d u4d;
        od2.a0(obj);
        int i = ((Boolean) this.X).booleanValue() ? 0 : 8;
        LinearLayout linearLayout = this.Y;
        linearLayout.setVisibility(i);
        bc7[] bc7Arr = MediaBarWidget.d1;
        MediaBarWidget mediaBarWidget = this.Z;
        mediaBarWidget.getClass();
        bc7[] bc7Arr2 = MediaBarWidget.d1;
        bc7 bc7 = bc7Arr2[12];
        RecyclerView recyclerView = (RecyclerView) mediaBarWidget.I0.getValue();
        if (linearLayout.getVisibility() == 0) {
            bc7 bc72 = bc7Arr2[11];
            u4d = (u4d) mediaBarWidget.H0.getValue();
        } else {
            u4d = null;
        }
        recyclerView.setAdapter(u4d);
        return e5f.a;
    }
}
