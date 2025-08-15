package one.me.chats.tab;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.arch.Widget;
import ru.ok.tamtam.android.prefs.PmsKey;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/chats/tab/ChatsTabWidget;", "Lone/me/sdk/arch/Widget;", "Lum9;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "(Ljava/lang/String;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatsTabWidget extends Widget implements um9 {
    public static final /* synthetic */ bc7[] C0;
    public final kw5 A0;
    public x77 B0;
    public final je7 X;
    public final je7 Y;
    public final q7c Z;
    public final x27 a;
    public final String b;
    public zu5 c;
    public final je7 o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public final je7 v0;
    public final je7 w0;
    public s04 x0;
    public final x30 y0;
    public final int z0;

    static {
        Class<ChatsTabWidget> cls = ChatsTabWidget.class;
        hob hob = new hob(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        oec oec = nec.a;
        C0 = new bc7[]{hob, zr6.e(oec, cls, "foldersTabs", "getFoldersTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), zr6.f(cls, "foldersViewPager", "getFoldersViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0, oec), zr6.f(cls, "pinbarsContainer", "getPinbarsContainer()Landroid/view/ViewGroup;", 0, oec)};
    }

    public ChatsTabWidget(String str) {
        this(dy7.g(new kpa("folder_id", str)));
    }

    public final x27 getInsetsConfig() {
        return this.a;
    }

    public final wja m0() {
        return (wja) this.s0.T0(this, C0[1]);
    }

    public final ViewPager2 n0() {
        return (ViewPager2) this.t0.T0(this, C0[2]);
    }

    public final cla o0() {
        return (cla) this.Z.T0(this, C0[0]);
    }

    public final void onAttach(View view) {
        int i;
        super.onAttach(view);
        k67 k67 = (k67) this.Y.getValue();
        if (!((t33) ((hyc) k67.a())).g.getBoolean("app.already.invited.friends", false)) {
            qyc qyc = (qyc) ((y7d) k67.a.getValue());
            qyc.getClass();
            int[] C02 = x53.C0(qyc.o(PmsKey.f51invitefriendssheetfrequency, nz4.a));
            int i2 = ((hyc) k67.a()).g.getInt("app.invite.friends.times.shown", 0);
            long j = ((hyc) k67.a()).g.getLong("app.first.invite.friends.time", -1);
            long j2 = ((hyc) k67.a()).g.getLong("app.first.login.time", 0);
            if (j < 0) {
                j = j2;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (C02.length > i2 && (i = C02[i2]) >= 0) {
                int i3 = ft4.o;
                if (ft4.e(z7.R(i, kt4.DAYS)) + j < currentTimeMillis) {
                    ((hyc) k67.a()).k(i2 + 1, "app.invite.friends.times.shown");
                    ((hyc) k67.a()).l("app.first.invite.friends.time", Long.valueOf(currentTimeMillis));
                    ((l67) k67.c.getValue()).a("show", "main", "trigger_max");
                    e57.c.P1().b(":invite/friends_to_max_bottom_sheet", (Bundle) null);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChangeEnded(defpackage.zu3 r12, defpackage.av3 r13) {
        /*
            r11 = this;
            boolean r12 = r13.b
            if (r12 == 0) goto L_0x010e
            jx5 r12 = r11.p0()
            boolean r12 = r12.x0
            r13 = 1
            je7 r0 = r11.o
            r1 = 0
            if (r12 != 0) goto L_0x00b4
            java.lang.Object r12 = r0.getValue()
            eua r12 = (defpackage.eua) r12
            acf r12 = r12.b
            boolean r2 = r12.a
            if (r2 == 0) goto L_0x0081
            p9g r12 = r12.b
            android.content.Context r12 = r12.a
            java.lang.String r2 = "appops"
            java.lang.Object r2 = r12.getSystemService(r2)     // Catch:{ all -> 0x005d }
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2     // Catch:{ all -> 0x005d }
            java.lang.Class<android.app.AppOpsManager> r3 = android.app.AppOpsManager.class
            java.lang.String r4 = "checkOpNoThrow"
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x005d }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r5, r6}     // Catch:{ all -> 0x005d }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ all -> 0x005d }
            r4 = 10020(0x2724, float:1.4041E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x005d }
            int r5 = android.os.Process.myUid()     // Catch:{ all -> 0x005d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x005d }
            java.lang.String r12 = r12.getPackageName()     // Catch:{ all -> 0x005d }
            java.lang.Object[] r12 = new java.lang.Object[]{r4, r5, r12}     // Catch:{ all -> 0x005d }
            java.lang.Object r12 = r3.invoke(r2, r12)     // Catch:{ all -> 0x005d }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x005d }
            int r12 = r12.intValue()     // Catch:{ all -> 0x005d }
            if (r12 != 0) goto L_0x005b
            goto L_0x008e
        L_0x005b:
            r12 = r1
            goto L_0x008f
        L_0x005d:
            r12 = move-exception
            njc r2 = new njc
            r2.<init>(r12)
            java.lang.Throwable r12 = defpackage.pjc.a(r2)
            if (r12 == 0) goto L_0x008e
            java.lang.Class<p9g> r2 = defpackage.p9g.class
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Permission check error "
            r3.<init>(r4)
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            defpackage.hm9.m(r2, r12, new java.lang.Object[0])
            goto L_0x008e
        L_0x0081:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r2 < r3) goto L_0x008e
            android.app.NotificationManager r12 = r12.c
            boolean r12 = r12.canUseFullScreenIntent()
            goto L_0x008f
        L_0x008e:
            r12 = r13
        L_0x008f:
            if (r12 != 0) goto L_0x00b4
            jx5 r12 = r11.p0()
            r12.x0 = r13
            java.lang.Object r12 = r0.getValue()
            eua r12 = (defpackage.eua) r12
            l5g r0 = new l5g
            r13 = 1
            r0.<init>(r11, r13)
            r12.getClass()
            int r3 = defpackage.j1c.permission_fsi_request
            int r4 = defpackage.j1c.permission_fsi_request_rationale
            int r5 = defpackage.j1c.permissions_fsi_request_positive_button
            java.lang.String[] r1 = defpackage.eua.o
            r2 = 180(0xb4, float:2.52E-43)
            r0.c(r1, r2, r3, r4, r5)
            goto L_0x010e
        L_0x00b4:
            java.lang.Object r12 = r0.getValue()
            eua r12 = (defpackage.eua) r12
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 < r3) goto L_0x00c7
            java.lang.String[] r4 = defpackage.eua.k
            boolean r12 = r12.b(r4)
            goto L_0x00cb
        L_0x00c7:
            r12.getClass()
            r12 = r13
        L_0x00cb:
            if (r12 != 0) goto L_0x010e
            je7 r12 = r11.X
            java.lang.Object r4 = r12.getValue()
            q33 r4 = (defpackage.q33) r4
            hyc r4 = (defpackage.hyc) r4
            t33 r4 = (defpackage.t33) r4
            ne7 r4 = r4.g
            java.lang.String r5 = "app.pushNotificationsRequested"
            boolean r1 = r4.getBoolean(r5, r1)
            if (r1 != 0) goto L_0x010e
            java.lang.Object r12 = r12.getValue()
            q33 r12 = (defpackage.q33) r12
            hyc r12 = (defpackage.hyc) r12
            r12.j(r5, r13)
            java.lang.Object r12 = r0.getValue()
            r4 = r12
            eua r4 = (defpackage.eua) r4
            l5g r5 = new l5g
            r12 = 1
            r5.<init>(r11, r12)
            if (r2 < r3) goto L_0x010b
            java.lang.String[] r6 = defpackage.eua.k
            int r8 = defpackage.j1c.permissions_post_notification_request_rationale
            int r9 = defpackage.j1c.permissions_post_notification_request_title
            int r10 = defpackage.j1c.permissions_post_notification_request_positive_button
            r7 = 177(0xb1, float:2.48E-43)
            r4.d(r5, r6, r7, r8, r9, r10)
            goto L_0x010e
        L_0x010b:
            r4.getClass()
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chats.tab.ChatsTabWidget.onChangeEnded(zu3, av3):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(p8a.c);
        cla cla = new cla(constraintLayout.getContext(), 6);
        int i = p8a.j;
        cla.setId(i);
        cla.setTransitionName(cla.getContext().getString(r8a.q));
        cla.setForm(uka.b);
        ti3 ti3 = new ti3(-1, -2);
        ti3.i = 0;
        int i2 = p8a.e;
        ti3.k = i2;
        ti3.e = 0;
        ti3.h = 0;
        cla.setLayoutParams(ti3);
        cla.setTitle(r8a.p);
        cla.setRightActions(new pka(new xka(new oq9(8)), new wka(woc.M0, 0, new pz2(0), 14)));
        eha searchView = cla.getSearchView();
        if (searchView != null) {
            searchView.setExpandable(false);
        }
        constraintLayout.addView(cla);
        wja wja = new wja(constraintLayout.getContext(), (AttributeSet) null);
        wja.setId(i2);
        wja.setTabMode(0);
        ti3 ti32 = new ti3(0, -2);
        ti32.j = i;
        int i3 = p8a.f;
        ti32.k = i3;
        ti32.e = 0;
        ti32.h = 0;
        wja.setLayoutParams(ti32);
        constraintLayout.addView(wja);
        w12 b2 = s36.b(constraintLayout.getContext());
        b2.setId(i3);
        ti3 ti33 = new ti3(0, -2);
        ti33.j = i2;
        int i4 = p8a.d;
        ti33.k = i4;
        ti33.e = 0;
        ti33.h = 0;
        constraintLayout.addView(b2, ti33);
        ViewPager2 viewPager2 = new ViewPager2(constraintLayout.getContext());
        viewPager2.setId(i4);
        ti3 ti34 = new ti3(0, 0);
        ti34.I = 1.0f;
        ti34.j = i3;
        ti34.l = 0;
        ti34.e = 0;
        ti34.h = 0;
        viewPager2.setLayoutParams(ti34);
        fm9.z(viewPager2);
        constraintLayout.addView(viewPager2);
        return constraintLayout;
    }

    public final void onDestroyView(View view) {
        String str = this.b;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, ey8.j("ONEME-6453|chats_list_lf | tabs view destroy. Scope isActive: ", j1e.z(getLifecycleScope())), (Throwable) null);
        }
        s04 s04 = this.x0;
        if (s04 != null) {
            s04.c();
        }
        this.x0 = null;
        this.c = null;
    }

    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        super.onUpdateArgs(bundle, bundle2);
        p0().q(bundle2.getString("folder_id"));
    }

    public final void onViewCreated(View view) {
        String str = this.b;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, ey8.j("ONEME-6453|chats_list_lf | tabs view created. Scope isActive: ", j1e.z(getLifecycleScope())), (Throwable) null);
        }
        n0().setAdapter(this.A0);
        kw5 kw5 = this.A0;
        kw5.Z = 0;
        while (((wv7) kw5.u0).h() > kw5.Z) {
            ((wv7) kw5.u0).g(((Number) kw5.Y.remove(0)).longValue());
        }
        n0().setOffscreenPageLimit(this.z0);
        s04 b2 = this.y0.b(m0(), n0(), new jy2(3, this), new vw(2, this, ChatsTabWidget.class, "handleLongClickOnFolderTab", "handleLongClickOnFolderTab(Landroid/view/View;Lone/me/common/tablayout/model/OneMeBaseTabItemModel;)V", 0, 12));
        b2.a();
        this.x0 = b2;
        od2.L(new zn5(tu0.g(p0().t0, getViewLifecycleOwner().Q(), fg7.o), new sz2((Continuation) null, this), 5), getViewLifecycleScope());
        ViewPager2 n0 = n0();
        View childAt = n0.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator((mdc) null);
            recyclerView.setHasFixedSize(true);
        }
        n0.b(new lh0(4, this));
        if (this.A0.z0.size() > 0) {
            n0.measure(View.MeasureSpec.makeMeasureSpec(n0.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(n0.getContext().getResources().getDisplayMetrics().heightPixels, 1073741824));
            if (this.A0.z0.size() > 1) {
                q0(1);
            }
        }
        znc childRouter = getChildRouter((ViewGroup) this.u0.T0(this, C0[3]));
        childRouter.e = 1;
        childRouter.Q(false);
        if (!childRouter.n()) {
            PinBarsWidget pinBarsWidget = new PinBarsWidget((Bundle) null, 1, (z84) null);
            pinBarsWidget.setRetainViewMode(getRetainViewMode());
            childRouter.R(i24.e(pinBarsWidget, (zu3) null, (zu3) null));
        }
        view.addOnAttachStateChangeListener(new ck(2, this));
        p0().q(getArgs().getString("folder_id"));
        od2.L(new zn5(tu0.g(p0().v0, getViewLifecycleOwner().Q(), fg7.X), new rz2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final jx5 p0() {
        return (jx5) this.v0.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r11 = (defpackage.coc) defpackage.x53.i0(r11.e());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q0(int r11) {
        /*
            r10 = this;
            kw5 r0 = r10.A0
            android.util.SparseArray r0 = r0.s0
            java.lang.Object r11 = r0.get(r11)
            znc r11 = (defpackage.znc) r11
            r0 = 0
            if (r11 == 0) goto L_0x001c
            java.util.ArrayList r11 = r11.e()
            java.lang.Object r11 = defpackage.x53.i0(r11)
            coc r11 = (defpackage.coc) r11
            if (r11 == 0) goto L_0x001c
            uu3 r11 = r11.a
            goto L_0x001d
        L_0x001c:
            r11 = r0
        L_0x001d:
            boolean r1 = r11 instanceof one.me.chats.list.ChatsListWidget
            if (r1 == 0) goto L_0x0024
            one.me.chats.list.ChatsListWidget r11 = (one.me.chats.list.ChatsListWidget) r11
            goto L_0x0025
        L_0x0024:
            r11 = r0
        L_0x0025:
            if (r11 != 0) goto L_0x0028
            return
        L_0x0028:
            java.lang.String r10 = r10.b
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x002f
            goto L_0x0070
        L_0x002f:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0070
            us7 r2 = defpackage.us7.X
            android.view.View r3 = r11.getView()
            if (r3 == 0) goto L_0x0046
            int r3 = r3.getMeasuredWidth()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0047
        L_0x0046:
            r3 = r0
        L_0x0047:
            android.view.View r4 = r11.getView()
            if (r4 == 0) goto L_0x0056
            int r4 = r4.getMeasuredHeight()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0057
        L_0x0056:
            r4 = r0
        L_0x0057:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "ONEME-6873|chats_list_page_state | root width:"
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = ", root height:"
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            r1.d(r2, r10, r3, r0)
        L_0x0070:
            android.view.View r10 = r11.getView()
            if (r10 == 0) goto L_0x0113
            java.lang.String r10 = r11.b
            java.lang.String r1 = "all.chat.folder"
            boolean r10 = defpackage.tpa.f(r10, r1)
            if (r10 == 0) goto L_0x0082
            goto L_0x0113
        L_0x0082:
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r10 = r11.o0()
            int r10 = r10.getMeasuredWidth()
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r11.o0()
            int r1 = r1.getMeasuredHeight()
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r2 = r11.o0()
            hdc r2 = r2.getAdapter()
            if (r2 == 0) goto L_0x00a5
            int r2 = r2.j()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x00a6
        L_0x00a5:
            r2 = r0
        L_0x00a6:
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r3 = r11.o0()
            int r3 = r3.getChildCount()
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r4 = r11.o0()
            r5 = 0
            r6 = r5
        L_0x00b4:
            int r7 = r4.getChildCount()
            if (r6 >= r7) goto L_0x00d2
            int r7 = r6 + 1
            android.view.View r6 = r4.getChildAt(r6)
            if (r6 == 0) goto L_0x00cc
            boolean r6 = r6.isAttachedToWindow()
            if (r6 == 0) goto L_0x00ca
            r5 = 1
            goto L_0x00d2
        L_0x00ca:
            r6 = r7
            goto L_0x00b4
        L_0x00cc:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException
            r10.<init>()
            throw r10
        L_0x00d2:
            java.lang.String r4 = r11.a
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L_0x00d9
            goto L_0x0113
        L_0x00d9:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x0113
            us7 r7 = defpackage.us7.X
            java.lang.String r11 = r11.b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "ONEME-6873|chats_list_page_state | chats list state. folderId:"
            r8.<init>(r9)
            r8.append(r11)
            java.lang.String r11 = " | width:"
            r8.append(r11)
            r8.append(r10)
            java.lang.String r10 = "|height:"
            r8.append(r10)
            java.lang.String r10 = " | child:"
            java.lang.String r11 = "|childAttached:"
            defpackage.ms2.k(r8, r1, r10, r3, r11)
            r8.append(r5)
            java.lang.String r10 = "|adapterCount:"
            r8.append(r10)
            r8.append(r2)
            java.lang.String r10 = r8.toString()
            r6.d(r7, r4, r10, r0)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chats.tab.ChatsTabWidget.q0(int):void");
    }

    public final spa r0() {
        return new spa((b2b) null, 0, zud.FOLDER_ID, Long.valueOf(n0().getCurrentItem() == 0 ? 1 : 2), (us) null, 19);
    }

    public ChatsTabWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = x27.d;
        String name = ChatsTabWidget.class.getName();
        this.b = name;
        this.o = dh0.a.getAccessor().d(eua.class);
        ys2 ys2 = ys2.a;
        this.X = ys2.getAccessor().d(q33.class);
        this.Y = ys2.getAccessor().d(k67.class);
        this.Z = viewBinding(p8a.j);
        this.s0 = viewBinding(p8a.e);
        this.t0 = viewBinding(p8a.d);
        this.u0 = viewBinding(p8a.f);
        this.v0 = createViewModelLazy(jx5.class, new ti2(22, new hn2(13)));
        this.w0 = ys2.getAccessor().d(an9.class);
        this.y0 = new x30(ys2.c().a(), 5);
        this.z0 = 3;
        b bVar = new b();
        bVar.setMaxRecycledViews(vs2.a, 30);
        bVar.setMaxRecycledViews(vs2.b, 15);
        double d = ((double) 10) * 1.5d;
        bVar.setMaxRecycledViews(p8a.u, tu0.F(d));
        bVar.setMaxRecycledViews(p8a.v, tu0.F(d));
        bVar.setMaxRecycledViews(gca.c, 3);
        this.A0 = new kw5(this, bVar, kw5.A0);
        ax7 b2 = ys2.b();
        b2.getClass();
        cta cta = cta.FOLDERS_INIT_TO_RENDER;
        b2.e.k(cta, new bta(cta, SystemClock.elapsedRealtime()));
        vxd T = j47.T(b2.d, (lx3) null, (vx3) null, new zw7(b2, (Continuation) null), 3);
        b2.f.put(zsa.EVENT_OPEN_CHATS, T);
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, name, ey8.j("ONEME-6453|chats_list_lf | tabs subscribe on new data. Scope isActive: ", j1e.z(getLifecycleScope())), (Throwable) null);
        }
        od2.L(new zn5(p0().t0, new qz2((Continuation) null, this), 5), getLifecycleScope());
    }
}
