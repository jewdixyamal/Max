package one.me.filedownloadwarning;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B;\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/filedownloadwarning/FileDownloadWarningBottomSheet;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "messageId", "", "attachId", "fileId", "fileName", "fileUrl", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "file-download-warning_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class FileDownloadWarningBottomSheet extends Widget implements ng3 {
    public static final /* synthetic */ int b = 0;
    public final je7 a;

    public FileDownloadWarningBottomSheet(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = createViewModelLazy(jh5.class, new nj4(3, new eh2(bundle, 4)));
    }

    public final void h(int i, Bundle bundle) {
        if (i == naa.a) {
            jh5 jh5 = (jh5) this.a.getValue();
            vxd n = pnf.n(jh5, ((w9a) ((kke) jh5.c.getValue())).b(), (vx3) null, new ih5(jh5, (Continuation) null), 2);
            jh5.Y.o1(jh5, jh5.Z[0], n);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new ActionBar.LayoutParams(-1, -1));
        frameLayout.setAlpha(0.0f);
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bc7[] bc7Arr = BottomSheetWidget.x0;
        znc znc = null;
        lg3 e = wg0.e(oaa.d, 6, (Bundle) null);
        e.f(new eqe(oaa.c));
        e.a(new mg3(naa.b, new eqe(oaa.b), 3, true), new mg3(naa.a, new eqe(oaa.a), 2, true));
        ConfirmationBottomSheet e2 = e.e();
        e2.addLifecycleListener(new ia3(3, this));
        e2.setTargetController(this);
        uu3 uu3 = this;
        while (uu3.getParentController() != null) {
            uu3 = uu3.getParentController();
        }
        foc foc = uu3 instanceof foc ? (foc) uu3 : null;
        if (foc != null) {
            znc = foc.T();
        }
        e2.z0(this);
        if (znc != null) {
            coc coc = new coc(e2, (String) null, (zu3) null, (zu3) null, false, -1);
            wg0.l(false, coc, true, "BottomSheetWidget");
            znc.G(coc);
        }
    }

    public FileDownloadWarningBottomSheet(long j, long j2, String str, long j3, String str2, String str3) {
        this(dy7.g(new kpa("chat_id", Long.valueOf(j)), new kpa("message_id", Long.valueOf(j2)), new kpa("attach_id", str), new kpa("file_id", Long.valueOf(j3)), new kpa("file_name", str2), new kpa("file_url", str3)));
    }
}
