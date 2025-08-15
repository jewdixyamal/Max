package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.tamtam.nano.Protos;

/* renamed from: a3g  reason: default package */
public final class a3g extends ppd {
    public final /* synthetic */ int X;
    public final Object Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3g(Object obj, ExecutorService executorService, int i) {
        super(executorService);
        this.X = i;
        this.Y = obj;
    }

    public void H(hqd hqd, int i) {
        hqd hqd2 = hqd;
        int i2 = i;
        switch (this.X) {
            case 0:
                if (hqd2 instanceof y2g) {
                    y2g y2g = (y2g) hqd2;
                    y2g.A((ol7) C(i2));
                    x2g x2g = (x2g) this.Y;
                    v7d v7d = new v7d(y2g, 17, x2g);
                    View view = y2g.a;
                    tu0.K(view, 300, v7d);
                    ((ufd) view).setOnSwitchCheckedListener(new en3(y2g, 3, x2g));
                    return;
                } else if (hqd2 instanceof z2g) {
                    z2g z2g = (z2g) hqd2;
                    om8 om8 = new om8(1, (x2g) this.Y, x2g.class, "onItemClick", "onItemClick(Lone/me/webapp/model/WebAppsSectionItem;)V", 0, 22);
                    z2g.A((ol7) C(i2));
                    tu0.K(z2g.a, 300, new v7d(z2g, 18, om8));
                    return;
                } else {
                    return;
                }
            case 1:
                ub ubVar = (ub) hqd2;
                ba baVar = (ba) ((ol7) C(i2));
                l lVar = new l(6, this);
                ubVar.A(baVar);
                ((lk3) ubVar.a).setOnClickListener(new tb((Object) lVar, 0, (Object) baVar));
                return;
            case 2:
                ((mh0) hqd2).A((ch0) ((ol7) C(i2)));
                return;
            case 3:
                J((zn3) hqd2, i2);
                return;
            case 4:
                vy3 vy3 = (vy3) hqd2;
                uy3 uy3 = (uy3) ((ol7) C(i2));
                jy2 jy2 = new jy2(8, this);
                vy3.A(uy3);
                ((LinearLayout) vy3.a).setOnClickListener(new tb((Object) jy2, 27, (Object) uy3));
                return;
            case 5:
                int l = ((fb5) ((ol7) C(i2))).l();
                int i3 = p8a.u;
                iv ivVar = this.o;
                if (l == i3) {
                    db5 db5 = (db5) hqd2;
                    fb5 fb5 = (fb5) ivVar.f.get(i2);
                    f fVar = new f(1, (ib5) this.Y, ib5.class, "onFakeChatItemClick", "onFakeChatItemClick(J)V", 0, 18);
                    vw vwVar = new vw(2, (ib5) this.Y, ib5.class, "onFakeChatItemLongTap", "onFakeChatItemLongTap(JLandroid/view/View;)V", 0, 18);
                    f fVar2 = new f(1, (ib5) this.Y, ib5.class, "onFakeChatItemButtonClick", "onFakeChatItemButtonClick(J)V", 0, 19);
                    db5.A(fb5);
                    m62 m62 = (m62) db5.a;
                    tu0.K(m62, 300, new bz0(fb5, fVar, fVar2, 1));
                    m62.setOnLongClickListener(new z52(vwVar, fb5, db5, 6));
                    return;
                } else if (l == p8a.v) {
                    hb5 hb5 = (hb5) hqd2;
                    fb5 fb52 = (fb5) ivVar.f.get(i2);
                    f fVar3 = new f(1, (ib5) this.Y, ib5.class, "onFakeChatItemClick", "onFakeChatItemClick(J)V", 0, 20);
                    vw vwVar2 = new vw(2, (ib5) this.Y, ib5.class, "onFakeChatItemLongTap", "onFakeChatItemLongTap(JLandroid/view/View;)V", 0, 19);
                    f fVar4 = new f(1, (ib5) this.Y, ib5.class, "onFakeChatItemButtonClick", "onFakeChatItemButtonClick(J)V", 0, 21);
                    hb5.A(fb52);
                    lk3 lk3 = (lk3) hb5.a;
                    hb5.F0 = fVar3;
                    hb5.G0 = fVar4;
                    if (fb52.Z) {
                        tu0.K(lk3, 300, new gb5(hb5, fb52, 0));
                        lk3.N();
                    } else {
                        tu0.K(lk3, 300, new gb5(hb5, fb52, 1));
                        CharSequence charSequence = fb52.Y;
                        if (charSequence != null) {
                            lk3.P(charSequence, new yf3(fVar4, 7, fb52));
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    lk3.setOnLongClickListener(new z52(vwVar2, fb52, hb5, 7));
                    return;
                } else {
                    return;
                }
            case 6:
                K((sd6) hqd2, i2);
                return;
            case 7:
                L((a57) hqd2, i2);
                return;
            case 8:
                M((ln8) hqd2, i2);
                return;
            case 9:
                N((kgb) hqd2, i2);
                return;
            case 10:
                N((kgb) hqd2, i2);
                return;
            case 13:
                O((hse) hqd2, i2);
                return;
            default:
                super.r(hqd, i);
                return;
        }
    }

    public void J(zn3 zn3, int i) {
        nn3 nn3 = (nn3) ((ol7) C(i));
        jy2 jy2 = new jy2(4, this);
        en3 en3 = new en3(nn3, 0, this);
        ga gaVar = new ga(nn3, 8, this);
        bk bkVar = new bk(6, this);
        zn3.A(nn3);
        tb tbVar = new tb((Object) gaVar, 19, (Object) nn3);
        View view = zn3.a;
        tu0.K(view, 300, tbVar);
        lk3 lk3 = (lk3) view;
        lk3.setOnLongClickListener(new ad2(en3, 1, nn3));
        if (!nn3.y0 || nn3.v0) {
            CharSequence charSequence = nn3.Y;
            if (charSequence != null) {
                lk3.P(charSequence, new yf3(jy2, 1, nn3));
            } else {
                lk3.N();
            }
        } else {
            lk3.setCallButtons(new ga(bkVar, 10, nn3));
        }
        lk3 lk32 = (lk3) view;
        Boolean bool = nn3.x0;
        boolean z = false;
        lk32.setSelectionEnabled(bool != null);
        if (bool != null) {
            z = bool.booleanValue();
        }
        lk32.setContactSelected(z);
    }

    public void K(sd6 sd6, int i) {
        sd6 sd62 = sd6;
        rd6 rd6 = (rd6) ((ol7) C(i));
        f fVar = new f(1, (qd6) this.Y, qd6.class, "onGlobalContactClick", "onGlobalContactClick(Lone/me/contactlist/recyclerview/adapter/search/GlobalContactListItem;)V", 0, 24);
        vw vwVar = new vw(2, (qd6) this.Y, qd6.class, "onGlobalContactCallClick", "onGlobalContactCallClick(Lone/me/contactlist/recyclerview/adapter/search/GlobalContactListItem;Z)V", 0, 20);
        sd62.A(rd6);
        lk3 lk3 = (lk3) sd62.a;
        tu0.K(lk3, 300, new vu5(fVar, 4, rd6));
        if (rd6.s0) {
            lk3.setCallButtons(new ga(vwVar, 14, rd6));
        } else {
            lk3.N();
        }
    }

    public void L(a57 a57, int i) {
        y47 y47 = (y47) ((ol7) C(i));
        f fVar = new f(1, (b57) this.Y, b57.class, "onInviteActionClick", "onInviteActionClick(Lone/me/inviteactions/list/InviteActionListItem$Type;)V", 0, 26);
        a57.A(y47);
        tu0.K(a57.a, 300, new vu5(fVar, 7, y47));
    }

    public void M(ln8 ln8, int i) {
        vw vwVar;
        kn8 kn8 = (kn8) ((ol7) C(i));
        if (kn8.s0 || kn8.t0) {
            vwVar = null;
        } else {
            vwVar = new vw(2, (fo8) this.Y, fo8.class, "onMemberLongClick", "onMemberLongClick(JLandroid/view/View;)V", 0, 25);
        }
        ga gaVar = new ga(kn8, 17, this);
        ln8.A(kn8);
        lk3 lk3 = (lk3) ln8.a;
        tu0.K(lk3, 300, new vu5(gaVar, 15, kn8));
        if (vwVar != null) {
            lk3.setOnLongClickListener(new ad2(vwVar, 3, kn8));
        } else {
            lk3.setOnLongClickListener((View.OnLongClickListener) null);
            lk3.setLongClickable(false);
        }
        lk3.N();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: gy1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: pl2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: ae7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: rl5} */
    /* JADX WARNING: type inference failed for: r1v3, types: [n6] */
    /* JADX WARNING: type inference failed for: r1v9, types: [d4d] */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11, types: [dec] */
    /* JADX WARNING: type inference failed for: r1v14, types: [dec] */
    /* JADX WARNING: type inference failed for: r1v20, types: [dec] */
    /* JADX WARNING: type inference failed for: r1v23, types: [dec] */
    /* JADX WARNING: type inference failed for: r1v26, types: [dec] */
    /* JADX WARNING: type inference failed for: r1v42 */
    /* JADX WARNING: type inference failed for: r1v43 */
    /* JADX WARNING: type inference failed for: r1v44 */
    /* JADX WARNING: type inference failed for: r1v45 */
    /* JADX WARNING: type inference failed for: r1v46 */
    /* JADX WARNING: type inference failed for: r1v47 */
    /* JADX WARNING: type inference failed for: r1v48 */
    /* JADX WARNING: type inference failed for: r1v49 */
    /* JADX WARNING: type inference failed for: r1v50 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void N(defpackage.kgb r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.X
            switch(r0) {
                case 9: goto L_0x013a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r2.C(r4)
            ol7 r4 = (defpackage.ol7) r4
            efb r4 = (defpackage.efb) r4
            r3.A(r4)
            boolean r0 = r4 instanceof defpackage.ql5
            r1 = 0
            if (r0 == 0) goto L_0x0031
            boolean r4 = r3 instanceof defpackage.rl5
            if (r4 == 0) goto L_0x001c
            r1 = r3
            rl5 r1 = (defpackage.rl5) r1
        L_0x001c:
            if (r1 == 0) goto L_0x0139
            ggb r3 = new ggb
            r4 = 0
            r3.<init>(r2, r4)
            vf1 r2 = new vf1
            r4 = 3
            r2.<init>(r3, r4, r1)
            androidx.appcompat.widget.AppCompatEditText r3 = r1.F0
            r3.addTextChangedListener(r2)
            goto L_0x0139
        L_0x0031:
            boolean r0 = r4 instanceof defpackage.zd7
            if (r0 == 0) goto L_0x0051
            boolean r4 = r3 instanceof defpackage.ae7
            if (r4 == 0) goto L_0x003c
            r1 = r3
            ae7 r1 = (defpackage.ae7) r1
        L_0x003c:
            if (r1 == 0) goto L_0x0139
            ggb r3 = new ggb
            r4 = 1
            r3.<init>(r2, r4)
            vf1 r2 = new vf1
            r4 = 6
            r2.<init>(r3, r4, r1)
            androidx.appcompat.widget.AppCompatEditText r3 = r1.F0
            r3.addTextChangedListener(r2)
            goto L_0x0139
        L_0x0051:
            boolean r0 = r4 instanceof defpackage.ol2
            if (r0 == 0) goto L_0x0071
            boolean r4 = r3 instanceof defpackage.pl2
            if (r4 == 0) goto L_0x005c
            r1 = r3
            pl2 r1 = (defpackage.pl2) r1
        L_0x005c:
            if (r1 == 0) goto L_0x0139
            ggb r3 = new ggb
            r4 = 2
            r3.<init>(r2, r4)
            ga r2 = new ga
            r4 = 3
            r2.<init>(r3, r4, r1)
            cka r3 = r1.F0
            r3.b(r2)
            goto L_0x0139
        L_0x0071:
            boolean r0 = r4 instanceof defpackage.vh4
            if (r0 == 0) goto L_0x009b
            boolean r4 = r3 instanceof defpackage.yh4
            if (r4 == 0) goto L_0x007c
            r1 = r3
            yh4 r1 = (defpackage.yh4) r1
        L_0x007c:
            if (r1 == 0) goto L_0x0139
            ggb r3 = new ggb
            r4 = 3
            r3.<init>(r2, r4)
            android.view.View r2 = r1.a
            xh4 r2 = (defpackage.xh4) r2
            a42 r4 = new a42
            r0 = 1
            r4.<init>(r0, r3)
            android.widget.EditText r3 = r2.t0
            vf1 r0 = new vf1
            r1 = 2
            r0.<init>(r4, r1, r2)
            r3.addTextChangedListener(r0)
            goto L_0x0139
        L_0x009b:
            boolean r0 = r4 instanceof defpackage.hz6
            if (r0 == 0) goto L_0x00bc
            boolean r4 = r3 instanceof defpackage.iz6
            if (r4 == 0) goto L_0x00a6
            r1 = r3
            iz6 r1 = (defpackage.iz6) r1
        L_0x00a6:
            if (r1 == 0) goto L_0x0139
            hgb r3 = new hgb
            r4 = 0
            r3.<init>(r2, r4)
            m6 r2 = new m6
            r4 = 12
            r2.<init>(r4, r3)
            android.view.View r3 = r1.a
            defpackage.tu0.K(r3, 300, r2)
            goto L_0x0139
        L_0x00bc:
            boolean r0 = r4 instanceof defpackage.gh4
            if (r0 == 0) goto L_0x00dc
            boolean r4 = r3 instanceof defpackage.fh4
            if (r4 == 0) goto L_0x00c7
            r1 = r3
            fh4 r1 = (defpackage.fh4) r1
        L_0x00c7:
            if (r1 == 0) goto L_0x0139
            hgb r3 = new hgb
            r4 = 1
            r3.<init>(r2, r4)
            m6 r2 = new m6
            r4 = 8
            r2.<init>(r4, r3)
            android.view.View r3 = r1.a
            defpackage.tu0.K(r3, 300, r2)
            goto L_0x0139
        L_0x00dc:
            boolean r0 = r4 instanceof defpackage.fy1
            if (r0 == 0) goto L_0x00fb
            boolean r4 = r3 instanceof defpackage.gy1
            if (r4 == 0) goto L_0x00e7
            r1 = r3
            gy1 r1 = (defpackage.gy1) r1
        L_0x00e7:
            if (r1 == 0) goto L_0x0139
            hgb r3 = new hgb
            r4 = 2
            r3.<init>(r2, r4)
            m6 r2 = new m6
            r4 = 2
            r2.<init>(r4, r3)
            one.me.sdk.uikit.common.button.OneMeButton r3 = r1.F0
            defpackage.tu0.K(r3, 300, r2)
            goto L_0x0139
        L_0x00fb:
            boolean r0 = r4 instanceof defpackage.x6
            if (r0 == 0) goto L_0x011a
            boolean r0 = r3 instanceof defpackage.n6
            if (r0 == 0) goto L_0x0106
            r1 = r3
            n6 r1 = (defpackage.n6) r1
        L_0x0106:
            if (r1 == 0) goto L_0x0139
            zja r3 = new zja
            r0 = 6
            r3.<init>(r2, r0, r4)
            m6 r2 = new m6
            r4 = 0
            r2.<init>(r4, r3)
            android.view.View r3 = r1.a
            defpackage.tu0.K(r3, 300, r2)
            goto L_0x0139
        L_0x011a:
            boolean r4 = r4 instanceof defpackage.pu7
            if (r4 == 0) goto L_0x0139
            boolean r4 = r3 instanceof defpackage.ru7
            if (r4 == 0) goto L_0x0125
            r1 = r3
            ru7 r1 = (defpackage.ru7) r1
        L_0x0125:
            if (r1 == 0) goto L_0x0139
            hgb r3 = new hgb
            r4 = 3
            r3.<init>(r2, r4)
            m6 r2 = new m6
            r4 = 14
            r2.<init>(r4, r3)
            android.view.View r3 = r1.a
            defpackage.tu0.K(r3, 300, r2)
        L_0x0139:
            return
        L_0x013a:
            java.lang.Object r4 = r2.C(r4)
            ol7 r4 = (defpackage.ol7) r4
            efb r4 = (defpackage.efb) r4
            r3.A(r4)
            boolean r0 = r4 instanceof defpackage.c4d
            r1 = 0
            if (r0 == 0) goto L_0x0166
            boolean r4 = r3 instanceof defpackage.d4d
            if (r4 == 0) goto L_0x0151
            r1 = r3
            d4d r1 = (defpackage.d4d) r1
        L_0x0151:
            if (r1 == 0) goto L_0x01d9
            hcb r3 = new hcb
            r4 = 0
            r3.<init>(r2, r4)
            vu5 r2 = new vu5
            r4 = 29
            r2.<init>(r1, r4, r3)
            android.view.View r3 = r1.a
            defpackage.tu0.K(r3, 300, r2)
            goto L_0x01d9
        L_0x0166:
            boolean r0 = r4 instanceof defpackage.qmd
            if (r0 == 0) goto L_0x01bb
            boolean r4 = r3 instanceof defpackage.tmd
            if (r4 == 0) goto L_0x0171
            r1 = r3
            tmd r1 = (defpackage.tmd) r1
        L_0x0171:
            if (r1 == 0) goto L_0x01d9
            hcb r3 = new hcb
            r4 = 1
            r3.<init>(r2, r4)
            vf1 r4 = new vf1
            r0 = 9
            r4.<init>(r1, r0, r3)
            androidx.appcompat.widget.AppCompatEditText r3 = r1.H0
            r3.addTextChangedListener(r4)
            icb r3 = new icb
            r4 = 0
            r3.<init>(r2, r4)
            m6 r4 = new m6
            r0 = 24
            r4.<init>(r0, r3)
            android.widget.ImageView r3 = r1.L0
            defpackage.tu0.K(r3, 300, r4)
            icb r3 = new icb
            r4 = 1
            r3.<init>(r2, r4)
            m6 r4 = new m6
            r0 = 25
            r4.<init>(r0, r3)
            androidx.appcompat.widget.AppCompatTextView r3 = r1.I0
            defpackage.tu0.K(r3, 300, r4)
            icb r3 = new icb
            r4 = 2
            r3.<init>(r2, r4)
            v7d r2 = new v7d
            r4 = 5
            r2.<init>(r1, r4, r3)
            one.me.sdk.uikit.common.button.OneMeButton r3 = r1.J0
            defpackage.tu0.K(r3, 300, r2)
            goto L_0x01d9
        L_0x01bb:
            boolean r0 = r4 instanceof defpackage.x6
            if (r0 == 0) goto L_0x01d9
            boolean r0 = r3 instanceof defpackage.n6
            if (r0 == 0) goto L_0x01c6
            r1 = r3
            n6 r1 = (defpackage.n6) r1
        L_0x01c6:
            if (r1 == 0) goto L_0x01d9
            zja r3 = new zja
            r0 = 2
            r3.<init>(r2, r0, r4)
            m6 r2 = new m6
            r4 = 0
            r2.<init>(r4, r3)
            android.view.View r3 = r1.a
            defpackage.tu0.K(r3, 300, r2)
        L_0x01d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a3g.N(kgb, int):void");
    }

    public void O(hse hse, int i) {
        vre vre = (vre) this.o.f.get(i);
        om8 om8 = new om8(1, (cse) this.Y, cse.class, "onSelected", "onSelected(Ljava/lang/String;)V", 0, 20);
        View view = hse.a;
        yre yre = (yre) view;
        yre.G0.setText(vre.a);
        Boolean bool = vre.b;
        yre.setSelected(bool != null ? bool.booleanValue() : false);
        tu0.K((yre) view, 300, new v7d(om8, 13, vre));
    }

    public int l(int i) {
        switch (this.X) {
            case 4:
                uy3 uy3 = (uy3) ((ol7) C(i));
                return zia.n;
            case 5:
                return ((fb5) ((ol7) C(i))).l();
            case 6:
                return ((rd6) ((ol7) C(i))).t0;
            case 7:
                return ((y47) ((ol7) C(i))).o;
            case 8:
                kn8 kn8 = (kn8) ((ol7) C(i));
                return 1;
            case 9:
                return ((efb) ((ol7) C(i))).l();
            case 10:
                return ((efb) ((ol7) C(i))).l();
            case 11:
                r9c r9c = (r9c) ((ol7) C(i));
                return r9c.b;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return ((ol7) C(i)).l();
            default:
                return super.l(i);
        }
    }

    public void r(dec dec, int i) {
        switch (this.X) {
            case 0:
                H((hqd) dec, i);
                return;
            case 1:
                ub ubVar = (ub) dec;
                ba baVar = (ba) ((ol7) C(i));
                l lVar = new l(6, this);
                ubVar.A(baVar);
                ((lk3) ubVar.a).setOnClickListener(new tb((Object) lVar, 0, (Object) baVar));
                return;
            case 2:
                ((mh0) dec).A((ch0) ((ol7) C(i)));
                return;
            case 3:
                J((zn3) dec, i);
                return;
            case 4:
                vy3 vy3 = (vy3) dec;
                uy3 uy3 = (uy3) ((ol7) C(i));
                jy2 jy2 = new jy2(8, this);
                vy3.A(uy3);
                ((LinearLayout) vy3.a).setOnClickListener(new tb((Object) jy2, 27, (Object) uy3));
                return;
            case 5:
                H((hqd) dec, i);
                return;
            case 6:
                K((sd6) dec, i);
                return;
            case 7:
                L((a57) dec, i);
                return;
            case 8:
                M((ln8) dec, i);
                return;
            case 9:
                N((kgb) dec, i);
                return;
            case 10:
                N((kgb) dec, i);
                return;
            case 13:
                O((hse) dec, i);
                return;
            default:
                super.r(dec, i);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: pl2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: ae7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: rl5} */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(defpackage.dec r4, int r5, java.util.List r6) {
        /*
            r3 = this;
            int r0 = r3.X
            switch(r0) {
                case 3: goto L_0x0135;
                case 4: goto L_0x0005;
                case 5: goto L_0x00f7;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x00bf;
                case 10: goto L_0x005e;
                case 11: goto L_0x0005;
                case 12: goto L_0x002d;
                case 13: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.s(r4, r5, r6)
            return
        L_0x0009:
            hse r4 = (defpackage.hse) r4
            java.lang.Object r6 = defpackage.x53.q0(r6)
            if (r6 == 0) goto L_0x0029
            boolean r3 = r6 instanceof defpackage.tre
            if (r3 == 0) goto L_0x002c
            tre r6 = (defpackage.tre) r6
            android.view.View r3 = r4.a
            yre r3 = (defpackage.yre) r3
            java.lang.Boolean r4 = r6.a
            if (r4 == 0) goto L_0x0024
            boolean r4 = r4.booleanValue()
            goto L_0x0025
        L_0x0024:
            r4 = 0
        L_0x0025:
            r3.setSelected(r4)
            goto L_0x002c
        L_0x0029:
            r3.O(r4, r5)
        L_0x002c:
            return
        L_0x002d:
            hqd r4 = (defpackage.hqd) r4
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0036
            goto L_0x005a
        L_0x0036:
            java.util.Iterator r0 = r6.iterator()
        L_0x003a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r0.next()
            boolean r1 = r1 instanceof defpackage.y2e
            if (r1 == 0) goto L_0x003a
            iv r3 = r3.o
            java.util.List r3 = r3.f
            java.lang.Object r3 = r3.get(r5)
            ol7 r3 = (defpackage.ol7) r3
            java.lang.Object r5 = defpackage.x53.g0(r6)
            r4.B(r3, r5)
            goto L_0x005d
        L_0x005a:
            r3.r(r4, r5)
        L_0x005d:
            return
        L_0x005e:
            kgb r4 = (defpackage.kgb) r4
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0069
            r3.N(r4, r5)
        L_0x0069:
            java.util.Iterator r3 = r6.iterator()
        L_0x006d:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00be
            java.lang.Object r5 = r3.next()
            boolean r6 = r5 instanceof defpackage.xfb
            if (r6 == 0) goto L_0x006d
            r6 = r5
            xfb r6 = (defpackage.xfb) r6
            boolean r0 = r6 instanceof defpackage.ufb
            r1 = 0
            if (r0 == 0) goto L_0x0094
            boolean r6 = r4 instanceof defpackage.rl5
            if (r6 == 0) goto L_0x008a
            r1 = r4
            rl5 r1 = (defpackage.rl5) r1
        L_0x008a:
            if (r1 == 0) goto L_0x006d
            ufb r5 = (defpackage.ufb) r5
            a73 r5 = r5.a
            r1.E(r5)
            goto L_0x006d
        L_0x0094:
            boolean r0 = r6 instanceof defpackage.vfb
            if (r0 == 0) goto L_0x00a9
            boolean r6 = r4 instanceof defpackage.ae7
            if (r6 == 0) goto L_0x009f
            r1 = r4
            ae7 r1 = (defpackage.ae7) r1
        L_0x009f:
            if (r1 == 0) goto L_0x006d
            vfb r5 = (defpackage.vfb) r5
            a73 r5 = r5.a
            r1.E(r5)
            goto L_0x006d
        L_0x00a9:
            boolean r6 = r6 instanceof defpackage.tfb
            if (r6 == 0) goto L_0x006d
            boolean r6 = r4 instanceof defpackage.pl2
            if (r6 == 0) goto L_0x00b4
            r1 = r4
            pl2 r1 = (defpackage.pl2) r1
        L_0x00b4:
            if (r1 == 0) goto L_0x006d
            tfb r5 = (defpackage.tfb) r5
            a73 r5 = r5.a
            r1.E(r5)
            goto L_0x006d
        L_0x00be:
            return
        L_0x00bf:
            kgb r4 = (defpackage.kgb) r4
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x00ca
            r3.N(r4, r5)
        L_0x00ca:
            java.util.Iterator r3 = r6.iterator()
        L_0x00ce:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00f6
            java.lang.Object r5 = r3.next()
            boolean r6 = r5 instanceof defpackage.xfb
            if (r6 == 0) goto L_0x00ce
            r6 = r5
            xfb r6 = (defpackage.xfb) r6
            boolean r6 = r6 instanceof defpackage.wfb
            if (r6 == 0) goto L_0x00ce
            boolean r6 = r4 instanceof defpackage.tmd
            if (r6 == 0) goto L_0x00eb
            r6 = r4
            tmd r6 = (defpackage.tmd) r6
            goto L_0x00ec
        L_0x00eb:
            r6 = 0
        L_0x00ec:
            if (r6 == 0) goto L_0x00ce
            wfb r5 = (defpackage.wfb) r5
            i24 r5 = r5.a
            r6.E(r5)
            goto L_0x00ce
        L_0x00f6:
            return
        L_0x00f7:
            hqd r4 = (defpackage.hqd) r4
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0131
            eb5 r0 = new eb5
            r1 = 7
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x010b:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0123
            java.lang.Object r1 = r6.next()
            boolean r2 = r1 instanceof defpackage.eb5
            if (r2 == 0) goto L_0x011c
            eb5 r1 = (defpackage.eb5) r1
            goto L_0x011d
        L_0x011c:
            r1 = 0
        L_0x011d:
            if (r1 == 0) goto L_0x010b
            r0.M1(r1)
            goto L_0x010b
        L_0x0123:
            iv r3 = r3.o
            java.util.List r3 = r3.f
            java.lang.Object r3 = r3.get(r5)
            ol7 r3 = (defpackage.ol7) r3
            r4.B(r3, r0)
            goto L_0x0134
        L_0x0131:
            r3.H(r4, r5)
        L_0x0134:
            return
        L_0x0135:
            zn3 r4 = (defpackage.zn3) r4
            java.lang.Object r6 = defpackage.x53.q0(r6)
            if (r6 == 0) goto L_0x015c
            boolean r3 = r6 instanceof defpackage.mn3
            if (r3 == 0) goto L_0x015f
            mn3 r6 = (defpackage.mn3) r6
            android.view.View r3 = r4.a
            lk3 r3 = (defpackage.lk3) r3
            java.lang.Boolean r4 = r6.a
            r5 = 0
            if (r4 == 0) goto L_0x014e
            r6 = 1
            goto L_0x014f
        L_0x014e:
            r6 = r5
        L_0x014f:
            r3.setSelectionEnabled(r6)
            if (r4 == 0) goto L_0x0158
            boolean r5 = r4.booleanValue()
        L_0x0158:
            r3.setContactSelected(r5)
            goto L_0x015f
        L_0x015c:
            r3.J(r4, r5)
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a3g.s(dec, int, java.util.List):void");
    }

    public final dec t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                if (i == kla.e) {
                    Context context = viewGroup.getContext();
                    pdc pdc = new pdc(-1, -2);
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setLayoutParams(pdc);
                    linearLayout.setOrientation(1);
                    ImageView imageView = new ImageView(context);
                    imageView.setBackground(new ShapeDrawable(new OvalShape()));
                    float f = (float) 54;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                    float f2 = (float) 20;
                    layoutParams.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f2);
                    layoutParams.bottomMargin = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                    layoutParams.gravity = 1;
                    imageView.setLayoutParams(layoutParams);
                    rh4.p((float) 15, fk4.d().getDisplayMetrics().density, imageView);
                    imageView.setImageResource(woc.U1);
                    v3c.y(new ze2(3, (Continuation) null, 10), imageView);
                    linearLayout.addView(imageView);
                    int G = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                    TextView textView = new TextView(context);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.leftMargin = G;
                    layoutParams2.rightMargin = G;
                    layoutParams2.bottomMargin = G;
                    layoutParams2.gravity = 1;
                    textView.setLayoutParams(layoutParams2);
                    textView.setGravity(17);
                    textView.setText(mla.k);
                    i4f.j.b(textView, du4.b);
                    v3c.y(new v9(3, (Continuation) null, 28), textView);
                    linearLayout.addView(textView);
                    TextView textView2 = new TextView(context);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams3.leftMargin = G;
                    layoutParams3.rightMargin = G;
                    layoutParams3.bottomMargin = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
                    layoutParams3.gravity = 1;
                    textView2.setLayoutParams(layoutParams3);
                    textView2.setGravity(17);
                    textView2.setText(mla.j);
                    i4f.f.b(textView2, du4.b);
                    v3c.y(new v9(3, (Continuation) null, 29), textView2);
                    linearLayout.addView(textView2);
                    return new az0(linearLayout, 21);
                } else if (i == kla.h) {
                    return new dec(new ufd(viewGroup.getContext(), (AttributeSet) null));
                } else {
                    if (i == kla.g) {
                        return new dec(new ufd(viewGroup.getContext(), (AttributeSet) null));
                    }
                    String name = a3g.class.getName();
                    ir6 ir6 = hm9.m;
                    if (ir6 != null && ir6.c()) {
                        ir6.d(us7.Z, name, zr6.h(i, "unknown item viewType: "), (Throwable) null);
                    }
                    return new az0(new View(viewGroup.getContext()), 22);
                }
            case 1:
                return new dec(new lk3(viewGroup.getContext(), (AttributeSet) null));
            case 2:
                return new mh0(viewGroup.getContext(), (wq3) this.Y);
            case 3:
                return new dec(new lk3(viewGroup.getContext(), (AttributeSet) null));
            case 4:
                return new vy3(viewGroup);
            case 5:
                if (i == p8a.u) {
                    return new dec(new m62(viewGroup.getContext()));
                }
                if (i == p8a.v) {
                    return new dec(new lk3(viewGroup.getContext(), (AttributeSet) null));
                }
                throw new IllegalArgumentException(wg0.g(i, "Unknown viewType '", "'"));
            case 6:
                return new dec(new lk3(viewGroup.getContext(), (AttributeSet) null));
            case 7:
                return new dec(new z47(viewGroup.getContext()));
            case 8:
                return new dec(new lk3(viewGroup.getContext(), (AttributeSet) null));
            case 9:
                int i2 = 536870911 & i;
                if (dy7.o(i2, 8192)) {
                    return new d4d(viewGroup.getContext());
                }
                if (dy7.o(i2, 8)) {
                    return new g2b(viewGroup.getContext(), 2);
                }
                if (dy7.o(i2, 16)) {
                    return new tmd(viewGroup.getContext());
                }
                if (dy7.o(i2, 2048)) {
                    return new g2b(viewGroup.getContext(), 1);
                }
                if (dy7.o(i2, 65536)) {
                    TextView textView3 = new TextView(viewGroup.getContext());
                    g2b g2b = new g2b(textView3);
                    textView3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    textView3.setGravity(17);
                    float f3 = (float) 12;
                    float f4 = (float) 28;
                    textView3.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
                    i4f.n.b(textView3, du4.b);
                    return g2b;
                } else if (dy7.o(i2, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) {
                    return new n6(viewGroup.getContext());
                } else {
                    throw new IllegalStateException(("unknown item viewType: " + i).toString());
                }
            case 10:
                int i3 = 536870911 & i;
                if (dy7.o(i3, 1)) {
                    return new rl5(viewGroup.getContext());
                }
                if (dy7.o(i3, 2)) {
                    return new ae7(viewGroup.getContext());
                }
                if (dy7.o(i3, 131072)) {
                    return new pl2(viewGroup.getContext());
                }
                if (dy7.o(i3, 4)) {
                    xh4 xh4 = new xh4(viewGroup.getContext());
                    dec dec = new dec(xh4);
                    xh4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    return dec;
                } else if (dy7.o(i3, 64)) {
                    return new iz6(viewGroup.getContext());
                } else {
                    if (dy7.o(i3, 128)) {
                        return new fh4(viewGroup.getContext());
                    }
                    if (dy7.o(i3, 256)) {
                        return new gy1(viewGroup.getContext());
                    }
                    if (dy7.o(i3, 512)) {
                        OneMeButton oneMeButton = new OneMeButton(viewGroup.getContext(), (AttributeSet) null);
                        dec dec2 = new dec(oneMeButton);
                        oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        oneMeButton.setSize(c7a.c);
                        oneMeButton.setMode(b7a.b);
                        oneMeButton.setAppearance(z6a.c);
                        oneMeButton.setText(vea.v0);
                        return dec2;
                    } else if (dy7.o(i3, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) {
                        return new n6(viewGroup.getContext());
                    } else {
                        if (dy7.o(i3, 2048)) {
                            return new g2b(viewGroup.getContext(), 1);
                        }
                        throw new IllegalStateException(("unknown item viewType: " + i).toString());
                    }
                }
            case 11:
                return new az0(new s9c(new e09(0, (jv2) this.Y, jv2.class, "onClearClick", "onClearClick()V", 0, 6), viewGroup.getContext()), 11);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return rxd.V((rxd) this.Y, viewGroup.getContext(), i);
            default:
                return new dec(new yre(viewGroup.getContext()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3g(ExecutorService executorService, Object obj, int i) {
        super(executorService);
        this.X = i;
        this.Y = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a3g(ExecutorService executorService, w2e w2e) {
        super(executorService);
        this.X = 12;
        this.Y = new rxd(29, w2e);
    }
}
