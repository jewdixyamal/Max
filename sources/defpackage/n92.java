package defpackage;

import android.os.Bundle;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: n92  reason: default package */
public final class n92 implements b64 {
    public final je7 a;
    public final je7 b;
    public final p92 c = p92.b;

    public n92(je7 je7, je7 je72) {
        this.a = je72;
        this.b = je7;
    }

    public final i64 a() {
        return this.c;
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        m92 m92;
        j64 j64;
        e64 e642 = e64;
        Bundle bundle2 = bundle;
        List list = null;
        if (!this.c.a.contains(e642)) {
            return null;
        }
        if (e642.equals(p92.c)) {
            kpa kpa = new kpa("id", Long.valueOf(i24.D("id", bundle2)));
            oz7 oz7 = o92.b;
            String F = i24.F("type", bundle2);
            oz7.getClass();
            kpa kpa2 = new kpa("type", oz7.j(F));
            kpa kpa3 = new kpa("load_mark", i24.v("load_mark", bundle2));
            kpa kpa4 = new kpa("message_id", i24.v("message_id", bundle2));
            if (bundle2.containsKey("highlights")) {
                list = w9e.Q0(i24.F("highlights", bundle2), new String[]{","}, true, 4);
            }
            m92 = new m92(dy7.g(kpa, kpa2, kpa3, kpa4, new kpa("highlights", list), new kpa("highlight_message", i24.u("highlight_message", bundle2)), new kpa("from_forward", i24.u("from_forward", bundle2)), new kpa("forward_msg_ids", i24.w("forward_msg_ids", bundle2)), new kpa("forward_attach_id", i24.v("forward_attach_id", bundle2)), new kpa("is_forward_attach", i24.u("is_forward_attach", bundle2)), new kpa(ApiProtocol.PARAM_PAYLOAD, bundle2.getString(ApiProtocol.PARAM_PAYLOAD))), 0);
        } else if (e642.equals(p92.d)) {
            e52 e52 = (e52) ((zrc) this.a.getValue()).a.getValue();
            if (e52 != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("id", e52.a);
                bundle3.putParcelable("type", o92.LOCAL_ID);
                m92 = new m92(bundle3, 1);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            throw new IllegalStateException(au1.f("invalid route ", e642));
        }
        if (((se5) ((qe5) this.b.getValue())).u()) {
            j64 = new j64(new m52(4), new m52(5));
        } else {
            new j64
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x011b: CONSTRUCTOR  (r0v6 ? I:j64) =  call: j64.<init>():void type: CONSTRUCTOR in method: n92.b(java.lang.String, e64, android.os.Bundle):l64, dex: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v6 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 38 more
                */
            /*
                this = this;
                r0 = r18
                r2 = r20
                r3 = r21
                p92 r1 = r0.c
                java.util.LinkedHashSet r1 = r1.a
                boolean r1 = r1.contains(r2)
                r4 = 0
                if (r1 != 0) goto L_0x0012
                return r4
            L_0x0012:
                e64 r1 = defpackage.p92.c
                boolean r1 = r2.equals(r1)
                java.lang.String r5 = "type"
                java.lang.String r6 = "id"
                if (r1 == 0) goto L_0x00c6
                long r7 = defpackage.i24.D(r6, r3)
                java.lang.Long r1 = java.lang.Long.valueOf(r7)
                kpa r7 = new kpa
                r7.<init>(r6, r1)
                oz7 r1 = defpackage.o92.b
                java.lang.String r6 = defpackage.i24.F(r5, r3)
                r1.getClass()
                o92 r1 = defpackage.oz7.j(r6)
                kpa r8 = new kpa
                r8.<init>(r5, r1)
                java.lang.String r1 = "load_mark"
                java.lang.Long r5 = defpackage.i24.v(r1, r3)
                kpa r9 = new kpa
                r9.<init>(r1, r5)
                java.lang.String r1 = "message_id"
                java.lang.Long r5 = defpackage.i24.v(r1, r3)
                kpa r10 = new kpa
                r10.<init>(r1, r5)
                java.lang.String r1 = "highlights"
                boolean r5 = r3.containsKey(r1)
                if (r5 == 0) goto L_0x006b
                java.lang.String r4 = defpackage.i24.F(r1, r3)
                java.lang.String r5 = ","
                java.lang.String[] r5 = new java.lang.String[]{r5}
                r6 = 1
                r11 = 4
                java.util.List r4 = defpackage.w9e.Q0(r4, r5, r6, r11)
            L_0x006b:
                kpa r11 = new kpa
                r11.<init>(r1, r4)
                java.lang.String r1 = "highlight_message"
                java.lang.Boolean r4 = defpackage.i24.u(r1, r3)
                kpa r12 = new kpa
                r12.<init>(r1, r4)
                java.lang.String r1 = "from_forward"
                java.lang.Boolean r4 = defpackage.i24.u(r1, r3)
                kpa r13 = new kpa
                r13.<init>(r1, r4)
                java.lang.String r1 = "forward_msg_ids"
                long[] r4 = defpackage.i24.w(r1, r3)
                kpa r14 = new kpa
                r14.<init>(r1, r4)
                java.lang.String r1 = "forward_attach_id"
                java.lang.Long r4 = defpackage.i24.v(r1, r3)
                kpa r15 = new kpa
                r15.<init>(r1, r4)
                java.lang.String r1 = "is_forward_attach"
                java.lang.Boolean r4 = defpackage.i24.u(r1, r3)
                kpa r5 = new kpa
                r5.<init>(r1, r4)
                java.lang.String r1 = "payload"
                java.lang.String r4 = r3.getString(r1)
                kpa r6 = new kpa
                r6.<init>(r1, r4)
                r16 = r5
                r17 = r6
                kpa[] r1 = new defpackage.kpa[]{r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17}
                android.os.Bundle r1 = defpackage.dy7.g(r1)
                m92 r4 = new m92
                r5 = 0
                r4.<init>(r1, r5)
                r6 = r4
                goto L_0x00f6
            L_0x00c6:
                e64 r1 = defpackage.p92.d
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L_0x013b
                je7 r1 = r0.a
                java.lang.Object r1 = r1.getValue()
                zrc r1 = (defpackage.zrc) r1
                j0e r1 = r1.a
                java.lang.Object r1 = r1.getValue()
                e52 r1 = (defpackage.e52) r1
                if (r1 == 0) goto L_0x012f
                android.os.Bundle r4 = new android.os.Bundle
                r4.<init>()
                long r7 = r1.a
                r4.putLong(r6, r7)
                o92 r1 = defpackage.o92.LOCAL_ID
                r4.putParcelable(r5, r1)
                m92 r1 = new m92
                r5 = 1
                r1.<init>(r4, r5)
                r6 = r1
            L_0x00f6:
                je7 r0 = r0.b
                java.lang.Object r0 = r0.getValue()
                qe5 r0 = (defpackage.qe5) r0
                se5 r0 = (defpackage.se5) r0
                boolean r0 = r0.u()
                if (r0 == 0) goto L_0x0119
                j64 r0 = new j64
                m52 r1 = new m52
                r4 = 4
                r1.<init>(r4)
                m52 r4 = new m52
                r5 = 5
                r4.<init>(r5)
                r0.<init>(r1, r4)
            L_0x0117:
                r5 = r0
                goto L_0x011f
            L_0x0119:
                j64 r0 = new j64
                r0.<init>()
                goto L_0x0117
            L_0x011f:
                l64 r8 = new l64
                r7 = 8
                r4 = 0
                r0 = r8
                r1 = r19
                r2 = r20
                r3 = r21
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
            L_0x012f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Required value was null."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x013b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "invalid route "
                java.lang.String r1 = defpackage.au1.f(r1, r2)
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.n92.b(java.lang.String, e64, android.os.Bundle):l64");
        }
    }
