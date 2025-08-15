package one.me.profileedit.screens.adminpermissions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profileedit/screens/adminpermissions/ProfileEditAdminPermissionsWidget;", "Lone/me/sdk/arch/Widget;", "Lmdb;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "contactId", "Lrdb;", "type", "(JJLrdb;)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ProfileEditAdminPermissionsWidget extends Widget implements mdb, ng3 {
    public static final /* synthetic */ bc7[] x0;
    public final khe X;
    public final je7 Y;
    public final jv5 Z;
    public final x27 a;
    public final fs b;
    public final fs c;
    public final fs o;
    public final q7c s0;
    public final q7c t0;
    public final gic u0;
    public final int v0;
    public vha w0;

    static {
        Class<ProfileEditAdminPermissionsWidget> cls = ProfileEditAdminPermissionsWidget.class;
        hob hob = new hob(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oec = nec.a;
        x0 = new bc7[]{hob, zr6.e(oec, cls, "contactId", "getContactId()J", 0), zr6.f(cls, "type", "getType()Lone/me/profileedit/screens/adminpermissions/ProfileEditAdminPermissionsType;", 0, oec), zr6.f(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oec), zr6.f(cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, oec)};
    }

    public ProfileEditAdminPermissionsWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = x27.d;
        Class<Long> cls = Long.class;
        this.b = new fs(cls, "chat_id");
        this.c = new fs(cls, "contact_id");
        this.o = new fs(rdb.class, "permissions_type");
        this.X = new khe(new lab(17));
        this.Y = createViewModelLazy(feb.class, new jp8(17, new geb(this, 0)));
        this.Z = new jv5(((iba) neb.a.getAccessor().c(iba.class)).a(), (Object) this, 10);
        this.s0 = viewBinding(sea.T);
        this.t0 = viewBinding(sea.Q);
        this.u0 = nu0.L(new geb(this, 1));
        this.v0 = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
    }

    public final x27 getInsetsConfig() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006d, code lost:
        r9 = o0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(int r10, android.os.Bundle r11) {
        /*
            r9 = this;
            int r11 = defpackage.sea.d0
            if (r10 != r11) goto L_0x000d
            feb r9 = r9.o0()
            r9.r()
            goto L_0x00a1
        L_0x000d:
            int r11 = defpackage.sea.c0
            if (r10 != r11) goto L_0x0021
            feb r9 = r9.o0()
            r9.getClass()
            g43 r10 = defpackage.g43.b
            s35 r9 = r9.B0
            defpackage.pnf.o(r9, r10)
            goto L_0x00a1
        L_0x0021:
            int r11 = defpackage.sea.H
            if (r10 != r11) goto L_0x0069
            feb r9 = r9.o0()
            e52 r10 = r9.s()
            if (r10 == 0) goto L_0x00a1
            je7 r11 = r9.u0
            java.lang.Object r11 = r11.getValue()
            pk r11 = (defpackage.pk) r11
            k92 r10 = r10.b
            long r3 = r10.a
            r0 = r11
            k4a r0 = (defpackage.k4a) r0
            long r1 = r9.b
            long r5 = r9.c
            r0.h(r1, r3, r5)
            kdb r10 = new kdb
            int r11 = defpackage.vea.S0
            eqe r0 = new eqe
            r0.<init>(r11)
            int r11 = defpackage.woc.z
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.<init>(r0, r11)
            s35 r11 = r9.C0
            defpackage.pnf.o(r11, r10)
            qdb r10 = new qdb
            long r0 = r9.b
            r10.<init>(r0)
            s35 r9 = r9.B0
            defpackage.pnf.o(r9, r10)
            goto L_0x00a1
        L_0x0069:
            int r11 = defpackage.sea.K
            if (r10 != r11) goto L_0x00a1
            feb r9 = r9.o0()
            e52 r10 = r9.s()
            if (r10 == 0) goto L_0x00a1
            je7 r11 = r9.u0
            java.lang.Object r11 = r11.getValue()
            pk r11 = (defpackage.pk) r11
            k92 r0 = r10.b
            long r4 = r0.a
            long r0 = r9.c
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.util.List r6 = java.util.Collections.singletonList(r2)
            int r8 = r10.e(r0)
            r1 = r11
            k4a r1 = (defpackage.k4a) r1
            long r2 = r10.a
            r7 = 0
            r1.I(r2, r4, r6, r7, r8)
            g43 r10 = defpackage.g43.b
            s35 r9 = r9.B0
            defpackage.pnf.o(r9, r10)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget.h(int, android.os.Bundle):void");
    }

    public final boolean m0() {
        return ((Boolean) this.X.getValue()).booleanValue();
    }

    public final rdb n0() {
        bc7 bc7 = x0[2];
        return (rdb) this.o.a(this);
    }

    public final feb o0() {
        return (feb) this.Y.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        yh9 yh9;
        yh9 yh92;
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        v3c.y(new ro2(3, (Continuation) null, 5), frameLayout);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(sea.Q);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        float f = (float) 24;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), tu0.G(fk4.d().getDisplayMetrics().density * f), recyclerView.getPaddingRight(), this.v0);
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setAdapter(this.Z);
        recyclerView.setItemAnimator((mdc) null);
        recyclerView.setHasFixedSize(true);
        bi9 bi9 = k37.a;
        bi9 bi92 = new bi9(3);
        bi92.g(2048);
        bi92.g(4096);
        bi92.g(128);
        recyclerView.j(new q1d(qp4.u0.j(recyclerView), new y98((Object) this, 21, (Object) bi92), (l) null, 12));
        if (m0()) {
            float f2 = (float) 8;
            yh9 = e37.b(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, 32768, tu0.G(fk4.d().getDisplayMetrics().density * f), 4096, tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density));
        } else {
            float f3 = (float) 6;
            yh9 = e37.b(0, tu0.G(fk4.d().getDisplayMetrics().density * f3), 32768, tu0.G(fk4.d().getDisplayMetrics().density * f), 4096, tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f));
        }
        if (m0()) {
            float f4 = (float) 8;
            yh92 = e37.b(tu0.G(fk4.d().getDisplayMetrics().density * f4), 0, 4096, tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density), 32768, tu0.G(f4 * fk4.d().getDisplayMetrics().density), tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density));
        } else {
            float f5 = (float) 12;
            yh92 = e37.b(0, tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density), 4096, tu0.G(((float) 30) * fk4.d().getDisplayMetrics().density), 32768, tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(f5 * fk4.d().getDisplayMetrics().density));
        }
        float f6 = (float) 12;
        recyclerView.j(new nz7(e37.b(tu0.G(fk4.d().getDisplayMetrics().density * f6), tu0.G(fk4.d().getDisplayMetrics().density * f), 4096, tu0.G(fk4.d().getDisplayMetrics().density * f), 32768, tu0.G(f6 * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density)), yh9, yh92, 0));
        frameLayout.addView(recyclerView);
        cla cla = new cla(frameLayout.getContext(), 6);
        cla.setId(sea.T);
        cla.setTitle(m0() ? vea.K0 : vea.n1);
        cla.setForm(uka.a);
        cla.setLeftActions(new lka(new heb(this, 0)));
        if (!m0()) {
            cla.setRightActions(new mka(new heb(this, 1)));
        }
        v3c.y(new ieb(3, (Continuation) null, 0), cla);
        frameLayout.addView(cla);
        if (m0()) {
            frameLayout.addView((View) this.u0.getValue());
        }
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        this.u0.b = c32.Y;
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        cla cla = (cla) this.s0.T0(this, x0[3]);
        pla.a(cla, new h76(cla, 18, this));
        p0();
        i3a h = getRouter().h();
        if (h != null) {
            h.a(this.lifecycleOwner, new ru3((Widget) this, 8));
        }
        t03 t03 = new t03(o0().B0, 11);
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(t03, getViewLifecycleOwner().Q(), fg7), new jeb((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new t03(o0().C0, 11), getViewLifecycleOwner().Q(), fg7), new keb((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(o0().F0, getViewLifecycleOwner().Q(), fg7), new leb((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void p0() {
        gic gic = this.u0;
        if (gic.a()) {
            OneMeButton oneMeButton = (OneMeButton) gic.getValue();
            if (oneMeButton.getVisibility() == 0) {
                pla.a(oneMeButton, new i76((ViewGroup) oneMeButton, (Object) this, (Object) oneMeButton, 16));
                return;
            }
            RecyclerView recyclerView = (RecyclerView) this.t0.T0(this, x0[4]);
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), this.v0);
        }
    }

    public ProfileEditAdminPermissionsWidget(long j, long j2, rdb rdb) {
        this(dy7.g(new kpa("chat_id", Long.valueOf(j)), new kpa("contact_id", Long.valueOf(j2)), new kpa("permissions_type", rdb)));
    }
}
