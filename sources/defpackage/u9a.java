package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: u9a  reason: default package */
public final class u9a {
    public final Context a;
    public final vz b;
    public final dt8 c;
    public final kz d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final je7 k;
    public final je7 l;
    public final je7 m;
    public final je7 n;
    public final ConcurrentHashMap o = new ConcurrentHashMap();

    public u9a(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, Context context, vz vzVar, dt8 dt8, kz kzVar, je7 je77, je7 je78, je7 je79, je7 je710) {
        this.a = context;
        this.b = vzVar;
        this.c = dt8;
        this.d = kzVar;
        this.e = je7;
        this.f = je72;
        this.g = je73;
        this.h = je74;
        this.i = je75;
        this.j = je76;
        this.k = je77;
        this.l = je78;
        this.m = je79;
        this.n = je710;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: cw8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: tx3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Comparable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: yv8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: yv8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: yv8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: yv8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: yv8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: yv8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: yv8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: yv8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: yv8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v36, resolved type: yv8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: cw8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: java.lang.Comparable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: cw8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: cw8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: cw8} */
    /* JADX WARNING: type inference failed for: r8v24, types: [bz7] */
    /* JADX WARNING: type inference failed for: r0v56, types: [bz7] */
    /* JADX WARNING: type inference failed for: r13v28, types: [bz7] */
    /* JADX WARNING: type inference failed for: r15v52, types: [bz7] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x041b, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x041c, code lost:
        r14 = r13;
        r13 = r12;
        r12 = r9;
        r8 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x042c, code lost:
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x042d, code lost:
        r19 = r2;
        r21 = r6;
        r22 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0437, code lost:
        if (r12.v() == false) goto L_0x048b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0439, code lost:
        r10.o = r0;
        r10.X = r1;
        r10.Y = r9;
        r10.Z = r12;
        r10.s0 = r14;
        r10.t0 = r4;
        r10.u0 = null;
        r10.v0 = null;
        r10.w0 = r13;
        r10.x0 = r5;
        r7 = r22;
        r10.y0 = r7;
        r2 = r19;
        r10.z0 = r2;
        r10.F0 = 5;
        r6 = r0.b(r12, r9, r5, r10);
        r15 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x045f, code lost:
        if (r6 != r15) goto L_0x0464;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0464, code lost:
        r11 = r0;
        r37 = r13;
        r13 = r1;
        r0 = r2;
        r2 = r6;
        r6 = r37;
        r38 = r7;
        r7 = r4;
        r3 = r38;
        r8 = r14;
        r40 = r12;
        r12 = r9;
        r9 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0477, code lost:
        r14 = r6;
        r6 = (defpackage.zv8) r2;
        r2 = 0;
        r37 = r15;
        r15 = r8;
        r38 = r13;
        r13 = r9;
        r8 = r3;
        r3 = r0;
        r0 = r11;
        r1 = r38;
        r11 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x048b, code lost:
        r2 = r19;
        r15 = r21;
        r7 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0495, code lost:
        if (r12.w() == false) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0497, code lost:
        r0.getClass();
        r6 = r12.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x049e, code lost:
        if (r6 == null) goto L_0x057c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x04a0, code lost:
        r11 = ((defpackage.ak3) r0.i.getValue()).b(r6);
        r19 = r15;
        r20 = r2;
        r22 = r7;
        r2 = defpackage.are.j(r0.a, r6, (defpackage.ak3) r0.i.getValue(), false, true);
        r3 = r0.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x04c4, code lost:
        if (r13 == false) goto L_0x04da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x04c6, code lost:
        r3 = new defpackage.yv8(r3.d(r2, r9, r5, (android.graphics.drawable.Drawable) r3.o.getValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x04da, code lost:
        r7 = (float) 34;
        r32 = defpackage.fe7.b(r3.f(), r2, r3.g().a(defpackage.os2.j), r3.b(r9, defpackage.tu0.G(defpackage.fk4.d().getDisplayMetrics().density * r7) + defpackage.dt8.e(r5, false)), 1, 48);
        r31 = defpackage.fe7.b(r3.f(), (java.lang.String) r3.f.getValue(), r3.g().a(defpackage.os2.c), r3.b(r9, defpackage.tu0.G(r7 * defpackage.fk4.d().getDisplayMetrics().density) + defpackage.dt8.e(r5, false)), 1, 48);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0547, code lost:
        if (r11 == null) goto L_0x0550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0549, code lost:
        r2 = r11.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0550, code lost:
        r2 = r6.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0553, code lost:
        r3 = new defpackage.wv8(r31, r32, r2, ((defpackage.ak3) r0.i.getValue()).c(r6), ((defpackage.ak3) r0.i.getValue()).a(r11, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0573, code lost:
        r6 = r3;
        r7 = r4;
        r15 = r14;
        r11 = r19;
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0585, code lost:
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0586, code lost:
        r20 = r2;
        r22 = r7;
        r19 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x058c, code lost:
        if (r11 == 0) goto L_0x05de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x058e, code lost:
        r10.o = r0;
        r10.X = r1;
        r10.Y = r9;
        r10.Z = r12;
        r10.s0 = r14;
        r10.t0 = r4;
        r10.u0 = null;
        r10.v0 = null;
        r10.w0 = r13;
        r10.x0 = r5;
        r7 = r22;
        r10.y0 = r7;
        r2 = r20;
        r10.z0 = r2;
        r10.F0 = 6;
        r6 = r0.d(r12, r9, r5, r10);
        r11 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x05b4, code lost:
        if (r6 != r11) goto L_0x05b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x05b8, code lost:
        r15 = r1;
        r37 = r13;
        r13 = r0;
        r0 = r2;
        r2 = r6;
        r6 = r37;
        r38 = r7;
        r7 = r4;
        r3 = r38;
        r8 = r14;
        r40 = r12;
        r12 = r9;
        r9 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x05cb, code lost:
        r14 = r6;
        r6 = (defpackage.zv8) r2;
        r2 = 0;
        r37 = r15;
        r15 = r8;
        r38 = r13;
        r13 = r9;
        r8 = r3;
        r3 = r0;
        r0 = r38;
        r1 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x05de, code lost:
        r11 = r19;
        r2 = r20;
        r7 = r22;
        r15 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x05ea, code lost:
        if (r12.y() == false) goto L_0x061e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x05ec, code lost:
        r18 = r1;
        r1 = r0.c;
        r19 = r2;
        r2 = r12.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x05f8, code lost:
        if (r2 == null) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x05fa, code lost:
        r2 = r2.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x05fd, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x05fe, code lost:
        if (r2 != null) goto L_0x0601;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0601, code lost:
        r15 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0602, code lost:
        r6 = new defpackage.yv8(r1.d(r15, r9, r5, (android.graphics.drawable.Drawable) r1.n.getValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0611, code lost:
        r15 = r14;
        r1 = r18;
        r2 = 0;
        r14 = r13;
        r13 = r12;
        r12 = r9;
        r8 = r7;
        r7 = r4;
        r3 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x061e, code lost:
        r18 = r1;
        r19 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0626, code lost:
        if (r12.z() == false) goto L_0x0645;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0628, code lost:
        r1 = r0.c;
        r6 = new defpackage.yv8(r1.d((java.lang.String) r1.g.getValue(), r9, r5, (android.graphics.drawable.Drawable) r1.l.getValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0645, code lost:
        r1 = r0.c;
        r6 = r12.s0;
        r21 = r4;
        r4 = r12.R0;
        r22 = r7;
        r7 = r0.c.g();
        r8 = defpackage.os2.f;
        r2 = ((defpackage.ida) r0.e.getValue()).j(r6, r4, (int) r7.a(r8).getTextSize());
        r24 = r1.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0672, code lost:
        if (r2 != null) goto L_0x0677;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0674, code lost:
        r25 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0677, code lost:
        r25 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0679, code lost:
        r2 = 0;
        r6 = new defpackage.yv8(defpackage.fe7.b(r24, r25, r1.g().a(r8), r1.b(r9, defpackage.dt8.e(r5, false)), 1, 48));
        r15 = r14;
        r1 = r18;
        r3 = r19;
        r7 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x069f, code lost:
        if (r14 == false) goto L_0x0742;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x06a5, code lost:
        if (r13.A() != false) goto L_0x06af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x06ab, code lost:
        if (r13.E() != false) goto L_0x06af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x06ad, code lost:
        r13 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x06af, code lost:
        r13 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x06b0, code lost:
        r14 = r0.f();
        r1 = r1;
        r18 = r13;
        r13 = r1.a().Y;
        r10.o = r6;
        r10.X = r15;
        r10.Y = r1;
        r10.Z = r0;
        r10.s0 = r12;
        r10.t0 = r7;
        r10.u0 = null;
        r10.v0 = null;
        r10.w0 = r5;
        r10.y0 = r8;
        r10.z0 = r3;
        r2 = r18;
        r10.A0 = r2;
        r10.F0 = 7;
        r1 = r14.b(r13, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x06e4, code lost:
        if (r1 != r11) goto L_0x06e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x06e8, code lost:
        r14 = r5;
        r5 = r15;
        r15 = r7;
        r7 = r12;
        r12 = r8;
        r9 = r6;
        r37 = r3;
        r4 = r0;
        r3 = r1;
        r0 = r2;
        r1 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x06f5, code lost:
        if (r0 == 0) goto L_0x06f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x06f7, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x06f9, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x06fa, code lost:
        r3 = (defpackage.uj3) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x06fc, code lost:
        if (r3 == null) goto L_0x0707;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0701, code lost:
        if (r3.Y != true) goto L_0x0705;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0703, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0705, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0709, code lost:
        r8 = !r0;
        r10.o = r9;
        r10.X = r15;
        r10.Y = null;
        r10.Z = null;
        r10.s0 = null;
        r10.t0 = null;
        r10.w0 = r14;
        r10.y0 = r12;
        r10.z0 = r1;
        r10.F0 = 8;
        r0 = r11;
        r3 = r9;
        r4 = r4.c(r5, r6, r7, r8, r14, r10);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0729, code lost:
        if (r4 != r0) goto L_0x072d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x072d, code lost:
        r0 = r1;
        r7 = r3;
        r2 = r4;
        r3 = r12;
        r5 = r14;
        r6 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0733, code lost:
        r15 = r0;
        r17 = r3;
        r22 = r5;
        r19 = r6;
        r20 = r7;
        r21 = (defpackage.vv8) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0742, code lost:
        r21 = null;
        r15 = r3;
        r22 = r5;
        r20 = r6;
        r19 = r7;
        r17 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x074e, code lost:
        r14 = new defpackage.cw8(r15, r17, r19, r20, r21, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01f1, code lost:
        if (r17 == 0) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01f3, code lost:
        r8 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01f5, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01f6, code lost:
        r6 = (defpackage.uj3) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01f8, code lost:
        if (r6 == null) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01fc, code lost:
        if (r6.Y != r12) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01fe, code lost:
        r6 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0200, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0201, code lost:
        r10.o = r0;
        r10.X = r1;
        r10.Y = null;
        r10.Z = null;
        r10.s0 = null;
        r10.t0 = null;
        r10.y0 = r2;
        r10.F0 = 2;
        r4 = r4.c(r5, r8, r7, r12 ^ r6, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x021a, code lost:
        if (r4 != r11) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x021e, code lost:
        r15 = r2;
        r2 = r4;
        r4 = r0;
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0222, code lost:
        r3 = (defpackage.zy7) r3;
        r13 = r3.a().b;
        r4.getClass();
        r12 = new defpackage.cw8(r13, r15, (android.text.Layout) null, (defpackage.zv8) null, (defpackage.vv8) r2, g(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0334, code lost:
        r4 = (defpackage.uj3) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0336, code lost:
        if (r4 == null) goto L_0x0345;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0338, code lost:
        r22 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x033f, code lost:
        if (r4.u() != true) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0341, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0343, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0345, code lost:
        r22 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0348, code lost:
        r2 = r2;
        r41 = r0.f();
        r5 = r2.a().Y;
        r10.o = r0;
        r10.X = r2;
        r10.Y = r9;
        r10.Z = r12;
        r10.s0 = r3;
        r10.t0 = r14;
        r42 = r0;
        r10.u0 = r20;
        r10.v0 = r1;
        r10.w0 = r13;
        r10.A0 = r11;
        r10.x0 = r15;
        r10.y0 = r7;
        r24 = r1;
        r10.z0 = r22;
        r0 = r21;
        r10.B0 = r0;
        r10.C0 = r4;
        r10.F0 = 4;
        r1 = r41.b(r5, r10);
        r6 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x038b, code lost:
        if (r1 != r6) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0390, code lost:
        r18 = r2;
        r26 = r14;
        r25 = r20;
        r2 = r1;
        r14 = r3;
        r1 = r0;
        r0 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x039b, code lost:
        if (r1 == 0) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x039d, code lost:
        r27 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x03a0, code lost:
        r27 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x03a2, code lost:
        if (r4 == 0) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x03a4, code lost:
        r28 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x03a7, code lost:
        r28 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x03a9, code lost:
        r2 = (defpackage.uj3) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x03ab, code lost:
        if (r2 == null) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x03b0, code lost:
        if (r2.Y != true) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x03b2, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x03b4, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03b8, code lost:
        r4 = r24.c(r25, r26, r27, r28, !r1, r15);
        r5 = r15;
        r1 = r18;
        r2 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x03cc, code lost:
        if (r12.u() == false) goto L_0x042d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03ce, code lost:
        r0.getClass();
        r11 = r12.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03d5, code lost:
        if (r11 == null) goto L_0x0423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03d7, code lost:
        r15 = defpackage.are.b;
        r19 = r2;
        r2 = defpackage.tfg.c(r11.c);
        r11 = r0.c;
        r21 = r6;
        r22 = r7;
        r6 = new defpackage.yv8(r11.d(((java.lang.String) r11.h.getValue()) + " " + r2, r9, r5, (android.graphics.drawable.Drawable) r11.m.getValue()));
        r7 = r4;
        r15 = r14;
        r3 = r19;
        r11 = r21;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.u9a r41, defpackage.zy7 r42, defpackage.tz r43, kotlin.coroutines.Continuation r44) {
        /*
            r0 = r41
            r1 = r42
            r9 = r43
            r2 = r44
            boolean r3 = r2 instanceof defpackage.o9a
            if (r3 == 0) goto L_0x001c
            r3 = r2
            o9a r3 = (defpackage.o9a) r3
            int r4 = r3.F0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.F0 = r4
        L_0x001a:
            r10 = r3
            goto L_0x0022
        L_0x001c:
            o9a r3 = new o9a
            r3.<init>(r0, r2)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r2 = r10.D0
            tx3 r11 = defpackage.tx3.a
            int r3 = r10.F0
            switch(r3) {
                case 0: goto L_0x019a;
                case 1: goto L_0x016b;
                case 2: goto L_0x015b;
                case 3: goto L_0x0115;
                case 4: goto L_0x00c6;
                case 5: goto L_0x009c;
                case 6: goto L_0x0077;
                case 7: goto L_0x0046;
                case 8: goto L_0x0033;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0033:
            long r0 = r10.z0
            long r3 = r10.y0
            boolean r5 = r10.w0
            java.lang.Object r6 = r10.X
            android.text.Layout r6 = (android.text.Layout) r6
            java.lang.Object r7 = r10.o
            zv8 r7 = (defpackage.zv8) r7
            defpackage.od2.a0(r2)
            goto L_0x0733
        L_0x0046:
            int r0 = r10.A0
            long r3 = r10.z0
            long r5 = r10.y0
            boolean r1 = r10.w0
            java.lang.Object r7 = r10.t0
            android.text.Layout r7 = (android.text.Layout) r7
            java.lang.Object r8 = r10.s0
            tz r8 = (defpackage.tz) r8
            java.lang.Object r9 = r10.Z
            u9a r9 = (defpackage.u9a) r9
            java.lang.Object r15 = r10.Y
            bz7 r15 = (defpackage.bz7) r15
            java.lang.Object r15 = r10.X
            cu8 r15 = (defpackage.cu8) r15
            java.lang.Object r12 = r10.o
            zv8 r12 = (defpackage.zv8) r12
            defpackage.od2.a0(r2)
            r14 = r1
            r37 = r3
            r3 = r2
            r1 = r37
            r4 = r9
            r9 = r12
            r12 = r5
            r5 = r15
            r15 = r7
            r7 = r8
            goto L_0x06f5
        L_0x0077:
            long r0 = r10.z0
            long r3 = r10.y0
            boolean r5 = r10.x0
            boolean r6 = r10.w0
            java.lang.Object r7 = r10.t0
            android.text.Layout r7 = (android.text.Layout) r7
            java.lang.Object r8 = r10.s0
            cu8 r8 = (defpackage.cu8) r8
            java.lang.Object r9 = r10.Z
            cu8 r9 = (defpackage.cu8) r9
            java.lang.Object r12 = r10.Y
            tz r12 = (defpackage.tz) r12
            java.lang.Object r15 = r10.X
            bz7 r15 = (defpackage.bz7) r15
            java.lang.Object r13 = r10.o
            u9a r13 = (defpackage.u9a) r13
            defpackage.od2.a0(r2)
            goto L_0x05cb
        L_0x009c:
            long r0 = r10.z0
            long r3 = r10.y0
            boolean r5 = r10.x0
            boolean r6 = r10.w0
            java.lang.Object r7 = r10.t0
            android.text.Layout r7 = (android.text.Layout) r7
            java.lang.Object r8 = r10.s0
            cu8 r8 = (defpackage.cu8) r8
            java.lang.Object r9 = r10.Z
            cu8 r9 = (defpackage.cu8) r9
            java.lang.Object r12 = r10.Y
            tz r12 = (defpackage.tz) r12
            java.lang.Object r13 = r10.X
            bz7 r13 = (defpackage.bz7) r13
            java.lang.Object r15 = r10.o
            u9a r15 = (defpackage.u9a) r15
            defpackage.od2.a0(r2)
            r37 = r15
            r15 = r11
            r11 = r37
            goto L_0x0477
        L_0x00c6:
            int r0 = r10.C0
            int r1 = r10.B0
            long r3 = r10.z0
            long r5 = r10.y0
            boolean r7 = r10.x0
            int r8 = r10.A0
            boolean r9 = r10.w0
            dt8 r12 = r10.v0
            java.lang.CharSequence r13 = r10.u0
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            java.lang.Object r15 = r10.t0
            tz r15 = (defpackage.tz) r15
            java.lang.Object r14 = r10.s0
            cu8 r14 = (defpackage.cu8) r14
            r41 = r0
            java.lang.Object r0 = r10.Z
            cu8 r0 = (defpackage.cu8) r0
            r42 = r0
            java.lang.Object r0 = r10.Y
            tz r0 = (defpackage.tz) r0
            r43 = r0
            java.lang.Object r0 = r10.X
            bz7 r0 = (defpackage.bz7) r0
            r18 = r0
            java.lang.Object r0 = r10.o
            u9a r0 = (defpackage.u9a) r0
            defpackage.od2.a0(r2)
            r22 = r3
            r24 = r12
            r25 = r13
            r26 = r15
            r4 = r41
            r12 = r42
            r15 = r7
            r13 = r9
            r9 = r43
            r37 = r11
            r11 = r8
            r7 = r5
            r6 = r37
            goto L_0x039b
        L_0x0115:
            int r0 = r10.B0
            long r5 = r10.z0
            long r7 = r10.y0
            boolean r1 = r10.x0
            int r3 = r10.A0
            boolean r9 = r10.w0
            dt8 r12 = r10.v0
            java.lang.CharSequence r13 = r10.u0
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            java.lang.Object r14 = r10.t0
            tz r14 = (defpackage.tz) r14
            java.lang.Object r15 = r10.s0
            cu8 r15 = (defpackage.cu8) r15
            java.lang.Object r4 = r10.Z
            cu8 r4 = (defpackage.cu8) r4
            r41 = r0
            java.lang.Object r0 = r10.Y
            tz r0 = (defpackage.tz) r0
            r42 = r0
            java.lang.Object r0 = r10.X
            bz7 r0 = (defpackage.bz7) r0
            r43 = r0
            java.lang.Object r0 = r10.o
            u9a r0 = (defpackage.u9a) r0
            defpackage.od2.a0(r2)
            r21 = r41
            r19 = r11
            r20 = r13
            r11 = r3
            r13 = r9
            r3 = r15
            r9 = r42
            r15 = r1
            r1 = r12
            r12 = r4
            r4 = r2
            r2 = r43
            goto L_0x0334
        L_0x015b:
            long r0 = r10.y0
            java.lang.Object r3 = r10.X
            bz7 r3 = (defpackage.bz7) r3
            java.lang.Object r4 = r10.o
            u9a r4 = (defpackage.u9a) r4
            defpackage.od2.a0(r2)
            r15 = r0
            goto L_0x0222
        L_0x016b:
            int r0 = r10.A0
            long r3 = r10.y0
            boolean r1 = r10.w0
            java.lang.Object r5 = r10.t0
            u9a r5 = (defpackage.u9a) r5
            java.lang.Object r6 = r10.s0
            bz7 r6 = (defpackage.bz7) r6
            java.lang.Object r6 = r10.Z
            cu8 r6 = (defpackage.cu8) r6
            java.lang.Object r7 = r10.Y
            tz r7 = (defpackage.tz) r7
            java.lang.Object r8 = r10.X
            bz7 r8 = (defpackage.bz7) r8
            java.lang.Object r9 = r10.o
            u9a r9 = (defpackage.u9a) r9
            defpackage.od2.a0(r2)
            r17 = r0
            r0 = r9
            r12 = 1
            r9 = r1
            r1 = r8
            r37 = r6
            r6 = r2
            r2 = r3
            r4 = r5
            r5 = r37
            goto L_0x01f1
        L_0x019a:
            defpackage.od2.a0(r2)
            cu8 r2 = r42.a()
            boolean r2 = r2.p()
            if (r2 == 0) goto L_0x0241
            boolean r2 = g(r42)
            cu8 r3 = r42.a()
        L_0x01af:
            boolean r4 = r3.p()
            if (r4 == 0) goto L_0x01be
            cu8 r4 = r3.C0
            int r5 = r4.V0
            r6 = 4
            if (r5 == r6) goto L_0x01be
            r3 = r4
            goto L_0x01af
        L_0x01be:
            long r4 = r3.b
            ds3 r6 = r41.f()
            cu8 r7 = r42.a()
            long r7 = r7.Y
            r10.o = r0
            r10.X = r1
            r10.Y = r9
            r10.Z = r3
            r10.s0 = r1
            r10.t0 = r0
            r10.w0 = r2
            r10.y0 = r4
            r12 = 1
            r10.A0 = r12
            r10.F0 = r12
            java.lang.Comparable r6 = r6.b(r7, r10)
            if (r6 != r11) goto L_0x01e7
            goto L_0x0757
        L_0x01e7:
            r7 = r9
            r17 = r12
            r9 = r2
            r37 = r4
            r4 = r0
            r5 = r3
            r2 = r37
        L_0x01f1:
            if (r17 == 0) goto L_0x01f5
            r8 = r12
            goto L_0x01f6
        L_0x01f5:
            r8 = 0
        L_0x01f6:
            uj3 r6 = (defpackage.uj3) r6
            if (r6 == 0) goto L_0x0200
            boolean r6 = r6.Y
            if (r6 != r12) goto L_0x0200
            r6 = r12
            goto L_0x0201
        L_0x0200:
            r6 = 0
        L_0x0201:
            r12 = r12 ^ r6
            r10.o = r0
            r10.X = r1
            r6 = 0
            r10.Y = r6
            r10.Z = r6
            r10.s0 = r6
            r10.t0 = r6
            r10.y0 = r2
            r6 = 2
            r10.F0 = r6
            r6 = r8
            r8 = r12
            java.lang.Object r4 = r4.c(r5, r6, r7, r8, r9, r10)
            if (r4 != r11) goto L_0x021e
            goto L_0x0757
        L_0x021e:
            r15 = r2
            r2 = r4
            r4 = r0
            r3 = r1
        L_0x0222:
            r19 = r2
            vv8 r19 = (defpackage.vv8) r19
            zy7 r3 = (defpackage.zy7) r3
            cu8 r0 = r3.a()
            long r13 = r0.b
            r4.getClass()
            boolean r20 = g(r3)
            cw8 r0 = new cw8
            r17 = 0
            r18 = 0
            r12 = r0
            r12.<init>(r13, r15, r17, r18, r19, r20)
            goto L_0x072b
        L_0x0241:
            cu8 r2 = r42.a()
            boolean r2 = r2.r()
            if (r2 == 0) goto L_0x0755
            cu8 r2 = r42.a()
            cu8 r12 = r2.C0
            if (r12 == 0) goto L_0x0755
            je7 r2 = r0.j
            java.lang.Object r2 = r2.getValue()
            t6b r2 = (defpackage.t6b) r2
            u6b r2 = r2.c(r12)
            boolean r13 = r12.p()
            boolean r3 = r12.A()
            if (r3 != 0) goto L_0x027e
            boolean r3 = r12.E()
            if (r3 != 0) goto L_0x027e
            boolean r3 = r12.D()
            if (r3 != 0) goto L_0x027e
            boolean r3 = r12.t()
            if (r3 == 0) goto L_0x027c
            goto L_0x027e
        L_0x027c:
            r14 = 0
            goto L_0x027f
        L_0x027e:
            r14 = 1
        L_0x027f:
            boolean r15 = g(r42)
            r8 = r12
        L_0x0284:
            boolean r3 = r8.p()
            if (r3 == 0) goto L_0x0293
            cu8 r3 = r8.C0
            int r4 = r3.V0
            r5 = 4
            if (r4 == r5) goto L_0x0293
            r8 = r3
            goto L_0x0284
        L_0x0293:
            long r6 = r12.b
            cu8 r3 = r42.a()
            long r4 = r3.b
            e52 r3 = r1.a
            boolean r3 = r3.I()
            if (r3 == 0) goto L_0x02d8
            dt8 r2 = r0.c
            e52 r3 = r1.a
            r3.k0()
            java.lang.CharSequence r3 = r3.u0
            r19 = r4
            e52 r4 = r1.a
            boolean r18 = r4.X()
            r21 = 1
            r22 = r19
            r4 = r43
            r5 = r14
            r24 = r6
            r6 = r18
            r7 = r21
            r19 = r11
            r11 = r8
            r8 = r15
            android.text.Layout r2 = r2.c(r3, r4, r5, r6, r7, r8)
            r4 = r2
            r5 = r15
            r6 = r19
            r2 = r22
            r7 = r24
            r37 = r14
            r14 = r11
            r11 = r37
            goto L_0x03c6
        L_0x02d8:
            r22 = r4
            r24 = r6
            r19 = r11
            r11 = r8
            dt8 r3 = r0.c
            ida r4 = r2.a
            int r4 = r4.g()
            r2.c(r4)
            java.lang.CharSequence r2 = r2.h
            ds3 r4 = r41.f()
            long r5 = r12.Y
            r10.o = r0
            r10.X = r1
            r10.Y = r9
            r10.Z = r12
            r10.s0 = r11
            r10.t0 = r9
            r7 = r2
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r10.u0 = r7
            r10.v0 = r3
            r10.w0 = r13
            r10.A0 = r14
            r10.x0 = r15
            r7 = r24
            r10.y0 = r7
            r0 = r22
            r10.z0 = r0
            r10.B0 = r14
            r0 = 3
            r10.F0 = r0
            java.lang.Comparable r0 = r4.b(r5, r10)
            r1 = r19
            if (r0 != r1) goto L_0x0323
            r11 = r1
            goto L_0x0757
        L_0x0323:
            r4 = r0
            r19 = r1
            r20 = r2
            r1 = r3
            r3 = r11
            r11 = r14
            r21 = r11
            r5 = r22
            r0 = r41
            r2 = r42
            r14 = r9
        L_0x0334:
            uj3 r4 = (defpackage.uj3) r4
            if (r4 == 0) goto L_0x0345
            boolean r4 = r4.u()
            r22 = r5
            r5 = 1
            if (r4 != r5) goto L_0x0343
            r4 = 1
            goto L_0x0348
        L_0x0343:
            r4 = 0
            goto L_0x0348
        L_0x0345:
            r22 = r5
            goto L_0x0343
        L_0x0348:
            ds3 r5 = r0.f()
            zy7 r2 = (defpackage.zy7) r2
            cu8 r6 = r2.a()
            r41 = r5
            long r5 = r6.Y
            r10.o = r0
            r10.X = r2
            r10.Y = r9
            r10.Z = r12
            r10.s0 = r3
            r10.t0 = r14
            r42 = r0
            r0 = r20
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.u0 = r0
            r10.v0 = r1
            r10.w0 = r13
            r10.A0 = r11
            r10.x0 = r15
            r10.y0 = r7
            r24 = r1
            r0 = r22
            r10.z0 = r0
            r0 = r21
            r10.B0 = r0
            r10.C0 = r4
            r1 = 4
            r10.F0 = r1
            r1 = r41
            java.lang.Comparable r1 = r1.b(r5, r10)
            r6 = r19
            if (r1 != r6) goto L_0x0390
            r11 = r6
            goto L_0x0757
        L_0x0390:
            r18 = r2
            r26 = r14
            r25 = r20
            r2 = r1
            r14 = r3
            r1 = r0
            r0 = r42
        L_0x039b:
            if (r1 == 0) goto L_0x03a0
            r27 = 1
            goto L_0x03a2
        L_0x03a0:
            r27 = 0
        L_0x03a2:
            if (r4 == 0) goto L_0x03a7
            r28 = 1
            goto L_0x03a9
        L_0x03a7:
            r28 = 0
        L_0x03a9:
            uj3 r2 = (defpackage.uj3) r2
            if (r2 == 0) goto L_0x03b6
            boolean r1 = r2.Y
            r2 = 1
            if (r1 != r2) goto L_0x03b4
            r1 = r2
            goto L_0x03b8
        L_0x03b4:
            r1 = 0
            goto L_0x03b8
        L_0x03b6:
            r2 = 1
            goto L_0x03b4
        L_0x03b8:
            r29 = r1 ^ 1
            r30 = r15
            android.text.Layout r1 = r24.c(r25, r26, r27, r28, r29, r30)
            r4 = r1
            r5 = r15
            r1 = r18
            r2 = r22
        L_0x03c6:
            boolean r15 = r12.u()
            java.lang.String r18 = "Required value was null."
            if (r15 == 0) goto L_0x042d
            r0.getClass()
            i10 r11 = r12.c()
            if (r11 == 0) goto L_0x0423
            java.lang.String[] r15 = defpackage.are.b
            r19 = r2
            long r2 = r11.c
            java.lang.String r2 = defpackage.tfg.c(r2)
            yv8 r3 = new yv8
            dt8 r11 = r0.c
            khe r15 = r11.m
            java.lang.Object r15 = r15.getValue()
            android.graphics.drawable.Drawable r15 = (android.graphics.drawable.Drawable) r15
            r21 = r6
            khe r6 = r11.h
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            r22 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = " "
            r7.append(r6)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            android.text.Layout r2 = r11.d(r2, r9, r5, r15)
            r3.<init>(r2)
            r6 = r3
            r7 = r4
            r15 = r14
            r3 = r19
            r11 = r21
        L_0x041b:
            r2 = 0
        L_0x041c:
            r14 = r13
            r13 = r12
            r12 = r9
            r8 = r22
            goto L_0x069f
        L_0x0423:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r18.toString()
            r0.<init>(r1)
            throw r0
        L_0x042d:
            r19 = r2
            r21 = r6
            r22 = r7
            boolean r2 = r12.v()
            if (r2 == 0) goto L_0x048b
            r10.o = r0
            r10.X = r1
            r10.Y = r9
            r10.Z = r12
            r10.s0 = r14
            r10.t0 = r4
            r2 = 0
            r10.u0 = r2
            r10.v0 = r2
            r10.w0 = r13
            r10.x0 = r5
            r7 = r22
            r10.y0 = r7
            r2 = r19
            r10.z0 = r2
            r6 = 5
            r10.F0 = r6
            java.lang.Object r6 = r0.b(r12, r9, r5, r10)
            r15 = r21
            if (r6 != r15) goto L_0x0464
            r11 = r15
            goto L_0x0757
        L_0x0464:
            r11 = r0
            r37 = r13
            r13 = r1
            r0 = r2
            r2 = r6
            r6 = r37
            r38 = r7
            r7 = r4
            r3 = r38
            r8 = r14
            r40 = r12
            r12 = r9
            r9 = r40
        L_0x0477:
            zv8 r2 = (defpackage.zv8) r2
            r14 = r6
            r6 = r2
            r2 = 0
            r37 = r15
            r15 = r8
            r38 = r13
            r13 = r9
            r8 = r3
            r3 = r0
            r0 = r11
            r1 = r38
            r11 = r37
            goto L_0x069f
        L_0x048b:
            r2 = r19
            r15 = r21
            r7 = r22
            boolean r6 = r12.w()
            if (r6 == 0) goto L_0x0586
            r0.getClass()
            n10 r6 = r12.e()
            if (r6 == 0) goto L_0x057c
            je7 r11 = r0.i
            java.lang.Object r11 = r11.getValue()
            ak3 r11 = (defpackage.ak3) r11
            uj3 r11 = r11.b(r6)
            r19 = r15
            je7 r15 = r0.i
            java.lang.Object r15 = r15.getValue()
            ak3 r15 = (defpackage.ak3) r15
            r20 = r2
            android.content.Context r2 = r0.a
            r22 = r7
            r3 = 0
            r7 = 1
            java.lang.String r2 = defpackage.are.j(r2, r6, r15, r3, r7)
            dt8 r3 = r0.c
            if (r13 == 0) goto L_0x04da
            yv8 r6 = new yv8
            khe r7 = r3.o
            java.lang.Object r7 = r7.getValue()
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            android.text.Layout r2 = r3.d(r2, r9, r5, r7)
            r6.<init>(r2)
            r3 = r6
            goto L_0x0573
        L_0x04da:
            fe7 r24 = r3.f()
            tpe r7 = r3.g()
            kqe r8 = defpackage.os2.j
            android.text.TextPaint r26 = r7.a(r8)
            r7 = 0
            int r8 = defpackage.dt8.e(r5, r7)
            r7 = 34
            float r7 = (float) r7
            android.content.res.Resources r15 = defpackage.fk4.d()
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()
            float r15 = r15.density
            float r15 = r15 * r7
            int r15 = defpackage.tu0.G(r15)
            int r15 = r15 + r8
            int r27 = r3.b(r9, r15)
            r28 = 1
            r29 = 48
            r25 = r2
            android.text.Layout r32 = r24.a(r25, r26, r27, r28, false, android.text.TextUtils.TruncateAt.END)
            fe7 r24 = r3.f()
            khe r2 = r3.f
            java.lang.Object r2 = r2.getValue()
            r25 = r2
            java.lang.String r25 = (java.lang.String) r25
            tpe r2 = r3.g()
            kqe r8 = defpackage.os2.c
            android.text.TextPaint r26 = r2.a(r8)
            r2 = 0
            int r8 = defpackage.dt8.e(r5, r2)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r7 = r7 * r2
            int r2 = defpackage.tu0.G(r7)
            int r2 = r2 + r8
            int r27 = r3.b(r9, r2)
            r28 = 1
            r29 = 48
            android.text.Layout r31 = r24.a(r25, r26, r27, r28, false, android.text.TextUtils.TruncateAt.END)
            if (r11 == 0) goto L_0x0550
            long r2 = r11.n()
        L_0x054d:
            r33 = r2
            goto L_0x0553
        L_0x0550:
            long r2 = r6.b
            goto L_0x054d
        L_0x0553:
            je7 r2 = r0.i
            java.lang.Object r2 = r2.getValue()
            ak3 r2 = (defpackage.ak3) r2
            java.lang.String r36 = r2.a(r11, r6)
            je7 r2 = r0.i
            java.lang.Object r2 = r2.getValue()
            ak3 r2 = (defpackage.ak3) r2
            java.lang.CharSequence r35 = r2.c(r6)
            wv8 r2 = new wv8
            r30 = r2
            r30.<init>(r31, r32, r33, r35, r36)
            r3 = r2
        L_0x0573:
            r6 = r3
            r7 = r4
            r15 = r14
            r11 = r19
            r3 = r20
            goto L_0x041b
        L_0x057c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r18.toString()
            r0.<init>(r1)
            throw r0
        L_0x0586:
            r20 = r2
            r22 = r7
            r19 = r15
            if (r11 == 0) goto L_0x05de
            r10.o = r0
            r10.X = r1
            r10.Y = r9
            r10.Z = r12
            r10.s0 = r14
            r10.t0 = r4
            r2 = 0
            r10.u0 = r2
            r10.v0 = r2
            r10.w0 = r13
            r10.x0 = r5
            r7 = r22
            r10.y0 = r7
            r2 = r20
            r10.z0 = r2
            r6 = 6
            r10.F0 = r6
            java.lang.Object r6 = r0.d(r12, r9, r5, r10)
            r11 = r19
            if (r6 != r11) goto L_0x05b8
            goto L_0x0757
        L_0x05b8:
            r15 = r1
            r37 = r13
            r13 = r0
            r0 = r2
            r2 = r6
            r6 = r37
            r38 = r7
            r7 = r4
            r3 = r38
            r8 = r14
            r40 = r12
            r12 = r9
            r9 = r40
        L_0x05cb:
            zv8 r2 = (defpackage.zv8) r2
            r14 = r6
            r6 = r2
            r2 = 0
            r37 = r15
            r15 = r8
            r38 = r13
            r13 = r9
            r8 = r3
            r3 = r0
            r0 = r38
            r1 = r37
            goto L_0x069f
        L_0x05de:
            r11 = r19
            r2 = r20
            r7 = r22
            boolean r6 = r12.y()
            java.lang.String r15 = ""
            if (r6 == 0) goto L_0x061e
            yv8 r6 = new yv8
            r18 = r1
            dt8 r1 = r0.c
            r19 = r2
            s10 r2 = r12.g()
            if (r2 == 0) goto L_0x05fd
            java.lang.String r2 = r2.c
            goto L_0x05fe
        L_0x05fd:
            r2 = 0
        L_0x05fe:
            if (r2 != 0) goto L_0x0601
            goto L_0x0602
        L_0x0601:
            r15 = r2
        L_0x0602:
            khe r2 = r1.n
            java.lang.Object r2 = r2.getValue()
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            android.text.Layout r1 = r1.d(r15, r9, r5, r2)
            r6.<init>(r1)
        L_0x0611:
            r15 = r14
            r1 = r18
            r2 = 0
            r14 = r13
            r13 = r12
            r12 = r9
            r8 = r7
            r7 = r4
            r3 = r19
            goto L_0x069f
        L_0x061e:
            r18 = r1
            r19 = r2
            boolean r1 = r12.z()
            if (r1 == 0) goto L_0x0645
            yv8 r3 = new yv8
            dt8 r1 = r0.c
            khe r2 = r1.l
            java.lang.Object r2 = r2.getValue()
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            khe r6 = r1.g
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            android.text.Layout r1 = r1.d(r6, r9, r5, r2)
            r3.<init>(r1)
            r6 = r3
            goto L_0x0611
        L_0x0645:
            yv8 r3 = new yv8
            dt8 r1 = r0.c
            je7 r2 = r0.e
            java.lang.Object r2 = r2.getValue()
            ida r2 = (defpackage.ida) r2
            java.lang.String r6 = r12.s0
            r21 = r4
            java.util.List r4 = r12.R0
            r22 = r7
            dt8 r7 = r0.c
            tpe r7 = r7.g()
            kqe r8 = defpackage.os2.f
            android.text.TextPaint r7 = r7.a(r8)
            float r7 = r7.getTextSize()
            int r7 = (int) r7
            java.lang.CharSequence r2 = r2.j(r6, r4, r7)
            fe7 r24 = r1.f()
            if (r2 != 0) goto L_0x0677
            r25 = r15
            goto L_0x0679
        L_0x0677:
            r25 = r2
        L_0x0679:
            tpe r2 = r1.g()
            android.text.TextPaint r26 = r2.a(r8)
            r2 = 0
            int r4 = defpackage.dt8.e(r5, r2)
            int r27 = r1.b(r9, r4)
            r29 = 48
            r28 = 1
            android.text.Layout r1 = r24.a(r25, r26, r27, r28, false, android.text.TextUtils.TruncateAt.END)
            r3.<init>(r1)
            r6 = r3
            r15 = r14
            r1 = r18
            r3 = r19
            r7 = r21
            goto L_0x041c
        L_0x069f:
            if (r14 == 0) goto L_0x0742
            boolean r14 = r13.A()
            if (r14 != 0) goto L_0x06af
            boolean r13 = r13.E()
            if (r13 != 0) goto L_0x06af
            r13 = 1
            goto L_0x06b0
        L_0x06af:
            r13 = r2
        L_0x06b0:
            ds3 r14 = r0.f()
            zy7 r1 = (defpackage.zy7) r1
            cu8 r2 = r1.a()
            r18 = r13
            r41 = r14
            long r13 = r2.Y
            r10.o = r6
            r10.X = r15
            r10.Y = r1
            r10.Z = r0
            r10.s0 = r12
            r10.t0 = r7
            r1 = 0
            r10.u0 = r1
            r10.v0 = r1
            r10.w0 = r5
            r10.y0 = r8
            r10.z0 = r3
            r2 = r18
            r10.A0 = r2
            r1 = 7
            r10.F0 = r1
            r1 = r41
            java.lang.Comparable r1 = r1.b(r13, r10)
            if (r1 != r11) goto L_0x06e8
            goto L_0x0757
        L_0x06e8:
            r14 = r5
            r5 = r15
            r15 = r7
            r7 = r12
            r12 = r8
            r9 = r6
            r37 = r3
            r4 = r0
            r3 = r1
            r0 = r2
            r1 = r37
        L_0x06f5:
            if (r0 == 0) goto L_0x06f9
            r6 = 1
            goto L_0x06fa
        L_0x06f9:
            r6 = 0
        L_0x06fa:
            uj3 r3 = (defpackage.uj3) r3
            if (r3 == 0) goto L_0x0707
            boolean r0 = r3.Y
            r3 = 1
            if (r0 != r3) goto L_0x0705
            r0 = r3
            goto L_0x0709
        L_0x0705:
            r0 = 0
            goto L_0x0709
        L_0x0707:
            r3 = 1
            goto L_0x0705
        L_0x0709:
            r8 = r0 ^ 1
            r10.o = r9
            r10.X = r15
            r0 = 0
            r10.Y = r0
            r10.Z = r0
            r10.s0 = r0
            r10.t0 = r0
            r10.w0 = r14
            r10.y0 = r12
            r10.z0 = r1
            r0 = 8
            r10.F0 = r0
            r0 = r11
            r3 = r9
            r9 = r14
            java.lang.Object r4 = r4.c(r5, r6, r7, r8, r9, r10)
            if (r4 != r0) goto L_0x072d
        L_0x072b:
            r11 = r0
            goto L_0x0757
        L_0x072d:
            r0 = r1
            r7 = r3
            r2 = r4
            r3 = r12
            r5 = r14
            r6 = r15
        L_0x0733:
            r13 = r2
            vv8 r13 = (defpackage.vv8) r13
            r15 = r0
            r17 = r3
            r22 = r5
            r19 = r6
            r20 = r7
            r21 = r13
            goto L_0x074e
        L_0x0742:
            r0 = 0
            r21 = r0
            r15 = r3
            r22 = r5
            r20 = r6
            r19 = r7
            r17 = r8
        L_0x074e:
            cw8 r0 = new cw8
            r14 = r0
            r14.<init>(r15, r17, r19, r20, r21, r22)
            goto L_0x072b
        L_0x0755:
            r0 = 0
            goto L_0x072b
        L_0x0757:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9a.a(u9a, zy7, tz, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static boolean g(zy7 zy7) {
        return zy7.a().t() || h(zy7);
    }

    public static boolean h(zy7 zy7) {
        if (zy7.a().D()) {
            return true;
        }
        CharSequence b2 = zy7.b.b(zy7.a);
        return ((b2 == null || b2.length() == 0) ^ true) && zy7.a().b() == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.cu8 r8, defpackage.tz r9, boolean r10, kotlin.coroutines.Continuation r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.n9a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            n9a r0 = (defpackage.n9a) r0
            int r1 = r0.v0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v0 = r1
            goto L_0x0018
        L_0x0013:
            n9a r0 = new n9a
            r0.<init>(r7, r11)
        L_0x0018:
            java.lang.Object r11 = r0.t0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.v0
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            boolean r10 = r0.s0
            l10 r7 = r0.Z
            tz r9 = r0.Y
            cu8 r8 = r0.X
            u9a r0 = r0.o
            defpackage.od2.a0(r11)
            r6 = r11
            r11 = r7
            r7 = r0
            r0 = r6
            goto L_0x005f
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003d:
            defpackage.od2.a0(r11)
            l10 r11 = r8.d()
            if (r11 == 0) goto L_0x00e2
            ds3 r2 = r7.f()
            r0.o = r7
            r0.X = r8
            r0.Y = r9
            r0.Z = r11
            r0.s0 = r10
            r0.v0 = r3
            long r4 = r8.Y
            java.lang.Comparable r0 = r2.b(r4, r0)
            if (r0 != r1) goto L_0x005f
            return r1
        L_0x005f:
            uj3 r0 = (defpackage.uj3) r0
            if (r0 != 0) goto L_0x006d
            ds3 r0 = r7.f()
            long r1 = r8.Y
            uj3 r0 = r0.a(r1)
        L_0x006d:
            boolean r8 = r0.Y
            r8 = r8 ^ r3
            if (r8 == 0) goto L_0x007f
            boolean r0 = r11.c()
            if (r0 != 0) goto L_0x0080
            boolean r0 = r11.a()
            if (r0 == 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r3 = 0
        L_0x0080:
            yv8 r0 = new yv8
            dt8 r7 = r7.c
            boolean r11 = r11.d()
            if (r3 == 0) goto L_0x009e
            if (r11 == 0) goto L_0x0095
            khe r8 = r7.u
            java.lang.Object r8 = r8.getValue()
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            goto L_0x00c7
        L_0x0095:
            khe r8 = r7.r
            java.lang.Object r8 = r8.getValue()
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            goto L_0x00c7
        L_0x009e:
            if (r8 == 0) goto L_0x00b4
            if (r11 == 0) goto L_0x00ab
            khe r8 = r7.t
            java.lang.Object r8 = r8.getValue()
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            goto L_0x00c7
        L_0x00ab:
            khe r8 = r7.q
            java.lang.Object r8 = r8.getValue()
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            goto L_0x00c7
        L_0x00b4:
            if (r11 == 0) goto L_0x00bf
            khe r8 = r7.s
            java.lang.Object r8 = r8.getValue()
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            goto L_0x00c7
        L_0x00bf:
            khe r8 = r7.p
            java.lang.Object r8 = r8.getValue()
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
        L_0x00c7:
            if (r11 == 0) goto L_0x00d2
            khe r11 = r7.j
            java.lang.Object r11 = r11.getValue()
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x00da
        L_0x00d2:
            khe r11 = r7.i
            java.lang.Object r11 = r11.getValue()
            java.lang.String r11 = (java.lang.String) r11
        L_0x00da:
            android.text.Layout r7 = r7.d(r11, r9, r10, r8)
            r0.<init>(r7)
            return r0
        L_0x00e2:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Required value was null."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9a.b(cu8, tz, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object c(cu8 cu8, boolean z, tz tzVar, boolean z2, boolean z3, o9a o9a) {
        cu8 cu82;
        String str;
        cu8 cu83 = cu8;
        tz tzVar2 = tzVar;
        boolean z4 = z3;
        cu8 cu84 = cu83.C0;
        boolean z5 = false;
        int i2 = cu84 != null ? cu84.V0 : 0;
        tx3 tx3 = tx3.a;
        if (i2 == 4) {
            e52 e52 = (e52) ((jz2) ((iy2) this.m.getValue())).n(cu83.B0).a.getValue();
            if (!(e52 == null || !e52.a0() || !z || (str = cu83.E0) == null || str.length() == 0)) {
                z5 = true;
            }
            if ((e52 == null || !e52.I()) && (cu82 = cu83.C0) != null && cu82.p()) {
                Object e2 = e(cu83.C0.C0, tzVar, z3, z, z2, o9a);
                return e2 == tx3 ? e2 : (vv8) e2;
            }
            long j2 = cu83.B0;
            String str2 = cu83.E0;
            long j3 = cu83.C0.c;
            Layout a2 = this.c.a(tzVar2, z4);
            dt8 dt8 = this.c;
            String str3 = cu83.D0;
            dt8.getClass();
            int e3 = dt8.e(z4, true);
            if (z5) {
                e3 = rh4.c((float) 22, fk4.d().getDisplayMetrics().density, e3);
            }
            int b2 = dt8.b(tzVar2, e3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (z5 && e52 != null) {
                g5a g5a = new g5a(dt8.a, j5a.a);
                String g2 = e52.g(kk0.a, jk0.a);
                Long valueOf = Long.valueOf(e52.f());
                e52.l0();
                g5a.b(oag.a(e52.x0, valueOf), g2);
                tpa.e(spannableStringBuilder, "​", new yl5((Drawable) g5a, (sl5) null, 6));
                tpa.e(spannableStringBuilder, "​", new bvd(tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density)));
            }
            if (str3 != null) {
                spannableStringBuilder.append(((ida) dt8.d.getValue()).j.e(str3));
            }
            SpannedString spannedString = new SpannedString(spannableStringBuilder);
            return new tv8(j2, str2, j3, (e52 == null || !e52.X()) ? dt8.f().a(spannedString, dt8.g().a(os2.j), b2, 1, false, TextUtils.TruncateAt.END) : i24.g(dt8.a, dt8.f(), spannedString, b2, dt8.g().a(os2.j), new g27(18)), a2);
        }
        Object e4 = e(cu8, tzVar, z3, z, z2, o9a);
        return e4 == tx3 ? e4 : (vv8) e4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        r1 = r1.h(0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(defpackage.cu8 r20, defpackage.tz r21, boolean r22, kotlin.coroutines.Continuation r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r23
            boolean r2 = r1 instanceof defpackage.p9a
            if (r2 == 0) goto L_0x0018
            r2 = r1
            p9a r2 = (defpackage.p9a) r2
            int r3 = r2.u0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.u0 = r3
        L_0x0016:
            r8 = r2
            goto L_0x001e
        L_0x0018:
            p9a r2 = new p9a
            r2.<init>(r0, r1)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r1 = r8.s0
            tx3 r2 = defpackage.tx3.a
            int r3 = r8.u0
            r4 = 1
            if (r3 == 0) goto L_0x0044
            if (r3 != r4) goto L_0x003c
            boolean r0 = r8.Z
            tz r2 = r8.Y
            cu8 r3 = r8.X
            u9a r4 = r8.o
            defpackage.od2.a0(r1)
            r11 = r0
            r0 = r4
            r18 = r3
            r3 = r1
            r1 = r18
            goto L_0x0068
        L_0x003c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0044:
            defpackage.od2.a0(r1)
            r8.o = r0
            r1 = r20
            r8.X = r1
            r10 = r21
            r8.Y = r10
            r11 = r22
            r8.Z = r11
            r8.u0 = r4
            r7 = 0
            r9 = 14
            kz r3 = r0.d
            r5 = 0
            r6 = 0
            r4 = r20
            java.lang.Object r3 = defpackage.kz.b(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x0067
            return r2
        L_0x0067:
            r2 = r10
        L_0x0068:
            ez r3 = (defpackage.ez) r3
            k8g r1 = r1.z0
            r4 = 0
            if (r1 == 0) goto L_0x0085
            l20 r1 = r1.h(r4)
            if (r1 == 0) goto L_0x0085
            je7 r5 = r0.l
            java.lang.Object r5 = r5.getValue()
            t00 r5 = (defpackage.t00) r5
            o20 r5 = (defpackage.o20) r5
            android.net.Uri r1 = r5.c(r1, r4)
        L_0x0083:
            r9 = r1
            goto L_0x0087
        L_0x0085:
            r1 = 0
            goto L_0x0083
        L_0x0087:
            xv8 r1 = new xv8
            java.lang.String r6 = r3.c
            java.lang.Integer r5 = r3.e
            if (r5 == 0) goto L_0x0095
            int r5 = r5.intValue()
            r7 = r5
            goto L_0x0096
        L_0x0095:
            r7 = r4
        L_0x0096:
            dt8 r0 = r0.c
            fe7 r12 = r0.f()
            java.lang.CharSequence r5 = r3.a
            if (r5 != 0) goto L_0x00a2
            java.lang.String r5 = ""
        L_0x00a2:
            r13 = r5
            tpe r5 = r0.g()
            kqe r8 = defpackage.os2.f
            android.text.TextPaint r14 = r5.a(r8)
            int r4 = defpackage.dt8.e(r11, r4)
            r5 = 36
            float r5 = (float) r5
            android.content.res.Resources r8 = defpackage.fk4.d()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r5 = r5 * r8
            int r5 = defpackage.tu0.G(r5)
            int r5 = r5 + r4
            int r15 = r0.b(r2, r5)
            r16 = 1
            r17 = 48
            android.text.Layout r8 = r12.a(r13, r14, r15, r16, false, android.text.TextUtils.TruncateAt.END)
            boolean r10 = r3.f
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9a.d(cu8, tz, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.cu8 r9, defpackage.tz r10, boolean r11, boolean r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof defpackage.q9a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            q9a r0 = (defpackage.q9a) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            q9a r0 = new q9a
            r0.<init>(r8, r14)
        L_0x0018:
            java.lang.Object r14 = r0.u0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            boolean r13 = r0.t0
            boolean r12 = r0.s0
            boolean r11 = r0.Z
            tz r10 = r0.Y
            cu8 r9 = r0.X
            u9a r8 = r0.o
            defpackage.od2.a0(r14)
            goto L_0x0059
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            defpackage.od2.a0(r14)
            ds3 r14 = r8.f()
            long r4 = r9.Y
            r0.o = r8
            r0.X = r9
            r0.Y = r10
            r0.Z = r11
            r0.s0 = r12
            r0.t0 = r13
            r0.w0 = r3
            java.lang.Comparable r14 = r14.b(r4, r0)
            if (r14 != r1) goto L_0x0059
            return r1
        L_0x0059:
            uj3 r14 = (defpackage.uj3) r14
            if (r14 != 0) goto L_0x0067
            ds3 r14 = r8.f()
            long r0 = r9.Y
            uj3 r14 = r14.a(r0)
        L_0x0067:
            long r0 = r14.n()
            dt8 r9 = r8.c
            android.text.Layout r9 = r9.a(r10, r11)
            dt8 r8 = r8.c
            r8.getClass()
            int r11 = defpackage.dt8.e(r11, r3)
            if (r12 == 0) goto L_0x008d
            r2 = 22
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r11 = defpackage.rh4.c(r2, r3, r11)
        L_0x008d:
            int r5 = r8.b(r10, r11)
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>()
            if (r12 == 0) goto L_0x00e7
            g5a r11 = new g5a
            j5a r12 = defpackage.j5a.a
            android.content.Context r2 = r8.a
            r11.<init>(r2, r12)
            kk0 r12 = defpackage.kk0.a
            java.lang.String r12 = r14.p(r12)
            long r2 = r14.n()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.CharSequence r3 = r14.m()
            uc0 r2 = defpackage.oag.a(r3, r2)
            r11.b(r2, r12)
            yl5 r12 = new yl5
            r2 = 0
            r3 = 6
            r12.<init>((android.graphics.drawable.Drawable) r11, (defpackage.sl5) r2, (int) r3)
            java.lang.Object[] r11 = new java.lang.Object[]{r12}
            java.lang.String r12 = "​"
            defpackage.tpa.e(r10, r12, r11)
            bvd r11 = new bvd
            r2 = 2
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = defpackage.tu0.G(r2)
            r11.<init>(r2)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            defpackage.tpa.e(r10, r12, r11)
        L_0x00e7:
            java.lang.String r11 = r14.d()
            r10.append(r11)
            android.text.SpannedString r4 = new android.text.SpannedString
            r4.<init>(r10)
            boolean r10 = r14.u()
            if (r10 != 0) goto L_0x0111
            fe7 r2 = r8.f()
            tpe r8 = r8.g()
            kqe r10 = defpackage.os2.j
            android.text.TextPaint r8 = r8.a(r10)
            r6 = 1
            r7 = 48
            r3 = r4
            r4 = r8
            android.text.Layout r8 = r2.a(r3, r4, r5, r6, false, android.text.TextUtils.TruncateAt.END)
            goto L_0x012b
        L_0x0111:
            fe7 r3 = r8.f()
            tpe r10 = r8.g()
            kqe r11 = defpackage.os2.j
            android.text.TextPaint r6 = r10.a(r11)
            bt8 r7 = new bt8
            r10 = 0
            r7.<init>(r13, r10)
            android.content.Context r2 = r8.a
            android.text.Layout r8 = defpackage.i24.g(r2, r3, r4, r5, r6, r7)
        L_0x012b:
            uv8 r10 = new uv8
            r10.<init>(r0, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9a.e(cu8, tz, boolean, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ds3 f() {
        return (ds3) this.h.getValue();
    }

    public final void i(List list) {
        xb9 xb9 = (xb9) this.k.getValue();
        xb9.getClass();
        if (!list.isEmpty()) {
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, "MissedContactsController", zr6.h(list.size(), "requestForMessages "), (Throwable) null);
            }
            gi9 gi9 = new gi9((Object) null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                xb9.f((cu8) it.next(), gi9, gi9, 5, false);
                xb9.b(gi9);
                xb9.b(gi9);
            }
            xb9.h().c(gi9);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b5 A[PHI: r12 
      PHI: (r12v2 java.lang.Object) = (r12v5 java.lang.Object), (r12v1 java.lang.Object) binds: [B:21:0x00b2, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(defpackage.e52 r10, defpackage.cu8 r11, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.r9a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            r9a r0 = (defpackage.r9a) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            r9a r0 = new r9a
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            defpackage.od2.a0(r12)
            goto L_0x00b5
        L_0x002c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0034:
            e52 r10 = r0.Y
            cu8 r11 = r0.X
            u9a r9 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x008d
        L_0x003e:
            defpackage.od2.a0(r12)
            java.util.concurrent.ConcurrentHashMap r12 = r9.o
            long r6 = r10.a
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r6)
            ww9 r6 = new ww9
            r7 = 6
            r6.<init>(r7)
            di r7 = new di
            r8 = 10
            r7.<init>(r8, r6)
            java.lang.Object r12 = r12.computeIfAbsent(r2, r7)
            xi9 r12 = (defpackage.xi9) r12
            t9a r2 = new t9a
            r2.<init>(r9, r11, r10, r5)
            r0.o = r9
            r0.X = r11
            r0.Y = r10
            r0.t0 = r4
            iec r4 = new iec
            r4.<init>(r12)
            lx3 r6 = r0.b
            jx3 r6 = r6.get(r4)
            if (r6 == 0) goto L_0x007c
            java.lang.Object r12 = r2.invoke(r0)
            goto L_0x008a
        L_0x007c:
            hec r6 = new hec
            r6.<init>(r4)
            yi9 r4 = new yi9
            r4.<init>(r12, r2, r5)
            java.lang.Object r12 = defpackage.j47.t0(r6, r4, r0)
        L_0x008a:
            if (r12 != r1) goto L_0x008d
            return r1
        L_0x008d:
            u6b r12 = (defpackage.u6b) r12
            yy7 r2 = new yy7
            r2.<init>()
            lr1 r4 = new lr1
            r6 = 7
            r4.<init>(r10, r11, r12, r6)
            zy7 r10 = r2.a(r4)
            r0.o = r5
            r0.X = r5
            r0.Y = r5
            r0.t0 = r3
            r9.getClass()
            s9a r11 = new s9a
            r11.<init>(r10, r9, r5)
            java.lang.Object r12 = defpackage.j1e.k(r11, r0)
            if (r12 != r1) goto L_0x00b5
            return r1
        L_0x00b5:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9a.j(e52, cu8, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
