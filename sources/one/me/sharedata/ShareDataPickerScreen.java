package one.me.sharedata;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/sharedata/ShareDataPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lckd;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "share-picker_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ShareDataPickerScreen extends AbstractPickerScreen<ckd> {
    public static final /* synthetic */ bc7[] D0;
    public static final x27 E0 = new x27(4, new yq0(4, 3, false));
    public znc A0;
    public final tz5 B0;
    public hc8 C0;
    public final x27 t0 = x27.c;
    public final q0e u0 = r0e.a(new eqe(rha.b));
    public final x3c v0;
    public final AutoTransition w0;
    public final qm0 x0;
    public final je7 y0;
    public w12 z0;

    static {
        hob hob = new hob(ShareDataPickerScreen.class, "inputView", "getInputView()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0);
        nec.a.getClass();
        D0 = new bc7[]{hob};
    }

    public ShareDataPickerScreen(Bundle bundle) {
        super(bundle);
        wjd wjd = wjd.a;
        this.v0 = new x3c((je7) wjd.getAccessor().d(q33.class), (je7) wjd.getAccessor().d(kke.class), (je7) wjd.getAccessor().d(iy2.class), w0(bundle));
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.addTarget(qha.c);
        autoTransition.addTarget(p8a.c0);
        autoTransition.addTarget(qha.a);
        autoTransition.setOrdering(0);
        autoTransition.setDuration(100);
        this.w0 = autoTransition;
        this.x0 = binding(new ekd(this, 0));
        this.y0 = createViewModelLazy(cc8.class, new nhd(3, new xid(1)));
        this.B0 = new tz5(this, 2);
        kr0 kr0 = new kr0((uu3) this, (k56) new ekd(this, 1));
        if (getRouter() != null) {
            getRouter().a(kr0);
        } else {
            addLifecycleListener(new o9(this, kr0, 12));
        }
    }

    public final x27 getInsetsConfig() {
        return this.t0;
    }

    public final bvc getScreenDelegate() {
        return new glc(new xid(2), new xx8(getArgs().getString("ref"), 1), 4);
    }

    public final boolean handleBack() {
        znc znc = this.A0;
        if (znc == null || !znc.n()) {
            return super.handleBack();
        }
        ((ckd) v0().c).k.z(1);
        return true;
    }

    public final Iterable m0() {
        csb csb = new csb(getContext());
        csb.setId(qha.c);
        csb.setBackgroundColor(qp4.u0.j(csb).a().h().a.d);
        csb.setLayoutParams(new LinearLayout.LayoutParams(-1, tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density)));
        od2.L(new zn5(((ckd) v0().c).h, new fkd(csb, (Continuation) null), 5), getViewLifecycleScope());
        return y53.M(csb, x0());
    }

    public final sya n0() {
        wjd wjd = wjd.a;
        return new m5d(this.v0, new xs2(wjd.getAccessor().d(iy2.class)), (je7) wjd.getAccessor().d(ds3.class), (je7) wjd.getAccessor().d(q33.class));
    }

    public final Widget o0(String str) {
        return new PickerChatsTabWidget(str, false, (m56) null, (oa2) null, 14, (z84) null);
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.z0 = null;
        this.A0 = null;
        hc8 hc8 = this.C0;
        if (hc8 != null) {
            hc8.a();
        }
        this.C0 = null;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [android.widget.FrameLayout, android.view.View, w12, android.view.ViewGroup] */
    public final void onViewCreated(View view) {
        View view2 = view;
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view2;
        br7.d(t0(), E0, (m56) null);
        ? frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(qha.b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.setLayoutParams(layoutParams);
        int i = vc7.a;
        frameLayout.setTranslationY((float) vc7.a(frameLayout.getContext()));
        br7.d(frameLayout, new x27(0, new yq0(5, 1, false), 1), (m56) null);
        this.z0 = frameLayout;
        this.A0 = getChildRouter(frameLayout);
        viewGroup.addView(frameLayout);
        od2.L(new zn5(v0().Z, new jkd(this, view2, (Continuation) null), 5), getViewLifecycleScope());
        od2.L(new zn5(((ckd) v0().c).j, new kkd(this, (Continuation) null), 5), getViewLifecycleScope());
        ViewGroup t02 = t0();
        znc znc = this.A0;
        w12 w12 = this.z0;
        if (znc != null && w12 != null) {
            ekd ekd = new ekd(this, 2);
            boolean z = ((gta) wjd.a.getAccessor().c(gta.class)).b && Build.VERSION.SDK_INT >= 30;
            pg7 viewLifecycleScope = getViewLifecycleScope();
            uy8 uy8 = (uy8) ((w7c) ((ckd) v0().c).k.c).a.getValue();
            this.C0 = new hc8(znc, w12, t02, ekd, z, viewLifecycleScope, (uy8 != null ? uy8.a : 0) == 2, new zja(this, 21, t02));
            new bc8((cc8) this.y0.getValue(), x0()).a(getViewLifecycleScope());
            od2.L(new zn5(new t03((w7c) ((ckd) v0().c).k.c, 11), new gkd(this, t02, (Continuation) null), 5), getViewLifecycleScope());
        }
    }

    public final cla p0(Context context) {
        String string = getArgs().getString("oneme:share:title", (String) null);
        if (string == null) {
            string = context.getString(rha.c);
        }
        cla cla = new cla(context, 6);
        cla.setId(qha.d);
        cla.setTransitionName(context.getString(r8a.q));
        cla.setTitle((CharSequence) string);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new rpc(7, this)));
        return cla;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v18, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: type inference failed for: r2v25 */
    /* JADX WARNING: type inference failed for: r2v26 */
    /* JADX WARNING: type inference failed for: r2v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.qza q0() {
        /*
            r11 = this;
            r0 = 2
            android.os.Bundle r1 = r11.getArgs()
            java.lang.String r2 = "share_data"
            java.lang.Class<ru.ok.tamtam.android.util.share.ShareData> r3 = ru.ok.tamtam.android.util.share.ShareData.class
            java.lang.Object r1 = defpackage.ay7.v(r1, r2, r3)
            ru.ok.tamtam.android.util.share.ShareData r1 = (ru.ok.tamtam.android.util.share.ShareData) r1
            if (r1 != 0) goto L_0x0135
            android.os.Bundle r1 = r11.getArgs()
            java.lang.String r2 = "oneme:share:data"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            android.content.Intent r1 = (android.content.Intent) r1
            r2 = 0
            if (r1 == 0) goto L_0x012b
            wjd r3 = defpackage.wjd.a
            v4 r4 = r3.getAccessor()
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            java.lang.Object r4 = r4.c(r5)
            android.content.Context r4 = (android.content.Context) r4
            v4 r5 = r3.getAccessor()
            java.lang.Class<o45> r6 = defpackage.o45.class
            java.lang.Object r5 = r5.c(r6)
            o45 r5 = (defpackage.o45) r5
            v4 r3 = r3.getAccessor()
            java.lang.Class<zi5> r6 = defpackage.zi5.class
            java.lang.Object r3 = r3.c(r6)
            zi5 r3 = (defpackage.zi5) r3
            java.lang.String r6 = r1.getAction()
            boolean r6 = defpackage.oag.t(r6)
            if (r6 == 0) goto L_0x0052
            goto L_0x012b
        L_0x0052:
            java.lang.String r6 = "android.intent.action.SEND"
            java.lang.String r7 = r1.getAction()
            boolean r6 = r6.equals(r7)
            r7 = 1
            java.lang.String r8 = "android.intent.extra.TEXT"
            r9 = 4
            if (r6 == 0) goto L_0x00e9
            ru.ok.tamtam.android.util.share.ShareData r6 = new ru.ok.tamtam.android.util.share.ShareData
            r6.<init>()
            int r10 = defpackage.tu0.l(r1)
            r6.type = r10
            if (r10 == 0) goto L_0x00d1
            if (r10 == r7) goto L_0x00ca
            if (r10 == r0) goto L_0x00c3
            if (r10 == r9) goto L_0x00bc
            r3 = 5
            if (r10 == r3) goto L_0x0079
            goto L_0x00d7
        L_0x0079:
            java.lang.String r3 = "handleVcardIntent failed, e: "
            java.lang.String r7 = "android.intent.extra.STREAM"
            android.os.Parcelable r7 = r1.getParcelableExtra(r7)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            android.net.Uri r7 = (android.net.Uri) r7     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            boolean r5 = defpackage.tfg.x(r7, r4, r5)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            if (r5 == 0) goto L_0x008a
            goto L_0x00b5
        L_0x008a:
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.io.InputStream r4 = r4.openInputStream(r7)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.lang.String r2 = defpackage.s5c.J(r4)     // Catch:{ Exception -> 0x009d }
        L_0x0096:
            defpackage.s5c.n(r4)
            goto L_0x00b5
        L_0x009a:
            r11 = move-exception
            r2 = r4
            goto L_0x00b8
        L_0x009d:
            r5 = move-exception
            goto L_0x00a3
        L_0x009f:
            r11 = move-exception
            goto L_0x00b8
        L_0x00a1:
            r5 = move-exception
            r4 = r2
        L_0x00a3:
            java.lang.String r7 = "tu0"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
            r9.<init>(r3)     // Catch:{ all -> 0x009a }
            r9.append(r5)     // Catch:{ all -> 0x009a }
            java.lang.String r3 = r9.toString()     // Catch:{ all -> 0x009a }
            defpackage.hm9.p(r7, r3, r2)     // Catch:{ all -> 0x009a }
            goto L_0x0096
        L_0x00b5:
            r6.vcard = r2
            goto L_0x00d7
        L_0x00b8:
            defpackage.s5c.n(r2)
            throw r11
        L_0x00bc:
            java.util.ArrayList r2 = defpackage.tu0.n(r1, r4, r5, r3)
            r6.files = r2
            goto L_0x00d7
        L_0x00c3:
            java.util.ArrayList r2 = defpackage.tu0.n(r1, r4, r5, r3)
            r6.videos = r2
            goto L_0x00d7
        L_0x00ca:
            java.util.ArrayList r2 = defpackage.tu0.n(r1, r4, r5, r3)
            r6.images = r2
            goto L_0x00d7
        L_0x00d1:
            java.lang.String r2 = defpackage.tu0.o(r1)
            r6.text = r2
        L_0x00d7:
            int r2 = r6.type
            if (r2 == 0) goto L_0x00e7
            boolean r2 = r1.hasExtra(r8)
            if (r2 == 0) goto L_0x00e7
            java.lang.String r1 = defpackage.tu0.o(r1)
            r6.text = r1
        L_0x00e7:
            r2 = r6
            goto L_0x012b
        L_0x00e9:
            java.lang.String r2 = "android.intent.action.SEND_MULTIPLE"
            java.lang.String r6 = r1.getAction()
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x012d
            ru.ok.tamtam.android.util.share.ShareData r2 = new ru.ok.tamtam.android.util.share.ShareData
            r2.<init>()
            int r6 = defpackage.tu0.l(r1)
            r2.type = r6
            if (r6 == r7) goto L_0x0115
            if (r6 == r0) goto L_0x010e
            if (r6 == r9) goto L_0x0107
            goto L_0x011b
        L_0x0107:
            java.util.ArrayList r3 = defpackage.tu0.m(r1, r4, r5, r3)
            r2.files = r3
            goto L_0x011b
        L_0x010e:
            java.util.ArrayList r3 = defpackage.tu0.m(r1, r4, r5, r3)
            r2.videos = r3
            goto L_0x011b
        L_0x0115:
            java.util.ArrayList r3 = defpackage.tu0.m(r1, r4, r5, r3)
            r2.images = r3
        L_0x011b:
            int r3 = r2.type
            if (r3 == 0) goto L_0x012b
            boolean r3 = r1.hasExtra(r8)
            if (r3 == 0) goto L_0x012b
            java.lang.String r1 = defpackage.tu0.o(r1)
            r2.text = r1
        L_0x012b:
            r1 = r2
            goto L_0x0135
        L_0x012d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "shouldn't be here"
            r11.<init>(r0)
            throw r11
        L_0x0135:
            r3 = r1
            ckd r1 = new ckd
            aea r4 = new aea
            r4.<init>((int) r0)
            wjd r0 = defpackage.wjd.a
            v4 r2 = r0.getAccessor()
            java.lang.Class<kke> r5 = defpackage.kke.class
            khe r6 = r2.d(r5)
            v4 r2 = r0.getAccessor()
            java.lang.Class<nkd> r5 = defpackage.nkd.class
            khe r7 = r2.d(r5)
            v4 r0 = r0.getAccessor()
            java.lang.Class<dc6> r2 = defpackage.dc6.class
            khe r8 = r0.d(r2)
            x3c r5 = r11.v0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sharedata.ShareDataPickerScreen.q0():qza");
    }

    public final j0e s0() {
        return this.u0;
    }

    public final Set w0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        Set n0 = longArray != null ? ys.n0(longArray) : null;
        return n0 == null ? wz4.a : n0;
    }

    public final sv8 x0() {
        bc7 bc7 = D0[0];
        return (sv8) this.x0.getValue();
    }
}
