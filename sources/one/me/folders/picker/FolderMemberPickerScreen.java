package one.me.folders.picker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lone/me/folders/picker/FolderMemberPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lsu5;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "resultTag", "", "membersIds", "(Ljava/lang/String;Ljava/lang/String;[J)V", "folders_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class FolderMemberPickerScreen extends AbstractPickerScreen<su5> {
    public static final /* synthetic */ bc7[] y0;
    public final x27 t0;
    public final q0e u0;
    public final x3c v0;
    public final fs w0;
    public final fs x0;

    static {
        Class<FolderMemberPickerScreen> cls = FolderMemberPickerScreen.class;
        y0 = new bc7[]{new hob(cls, "folderId", "getFolderId()Ljava/lang/String;", 0), zr6.e(nec.a, cls, "tag", "getTag()Ljava/lang/String;", 0)};
    }

    public FolderMemberPickerScreen(Bundle bundle) {
        super(bundle);
        this.t0 = x27.d;
        this.u0 = r0e.a(new eqe(r8a.X));
        xv5 xv5 = xv5.a;
        this.v0 = new x3c((je7) xv5.getAccessor().d(q33.class), (je7) xv5.getAccessor().d(kke.class), (je7) xv5.getAccessor().d(iy2.class), w0(bundle));
        Class<String> cls = String.class;
        this.w0 = new fs(cls, "folder_id");
        this.x0 = new fs(cls, "result_tag");
        kr0 kr0 = new kr0((uu3) this, (k56) new es3(18, this));
        if (getRouter() != null) {
            getRouter().a(kr0);
        } else {
            addLifecycleListener(new o9(this, kr0, 5));
        }
    }

    public final x27 getInsetsConfig() {
        return this.t0;
    }

    public final Iterable m0() {
        return nz4.a;
    }

    public final sya n0() {
        xv5 xv5 = xv5.a;
        return new m5d(this.v0, new xs2(xv5.getAccessor().d(iy2.class)), (je7) xv5.getAccessor().d(ds3.class), (je7) xv5.getAccessor().d(q33.class));
    }

    public final Widget o0(String str) {
        return new PickerChatsListWidget("all.chat.folder", str, (oa2) null, false, false, (m56) null, 52, (z84) null);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(v0().Z, getViewLifecycleOwner().Q(), fg7.o), new tu5((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(((su5) v0().c).e, new uu5((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final cla p0(Context context) {
        cla cla = new cla(context, 6);
        cla.setId(oba.a);
        cla.setTransitionName(context.getString(r8a.q));
        cla.setTitle(r8a.Y);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new jy2(15, this)));
        return cla;
    }

    public final qza q0() {
        xv5 xv5 = xv5.a;
        return new su5(xv5.getAccessor().d(ta2.class), xv5.getAccessor().d(kke.class), this.v0);
    }

    public final j0e s0() {
        return this.u0;
    }

    public final Set w0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("preselected_ids");
        return longArray != null ? ys.n0(longArray) : wz4.a;
    }

    public FolderMemberPickerScreen(String str, String str2, long[] jArr) {
        this(dy7.g(new kpa("folder_id", str), new kpa("result_tag", str2), new kpa("preselected_ids", jArr)));
    }
}
