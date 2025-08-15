package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: fu5  reason: default package */
public final class fu5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ nu5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fu5(nu5 nu5, Continuation continuation) {
        super(2, continuation);
        this.Y = nu5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fu5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fu5(this.Y, continuation);
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
        */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r7.X
            r2 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 != r2) goto L_0x000d
            defpackage.od2.a0(r8)
            goto L_0x0077
        L_0x000d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0015:
            defpackage.od2.a0(r8)
            nu5 r8 = r7.Y
            at5 r8 = r8.A0
            nu5 r1 = r7.Y
            java.util.concurrent.atomic.AtomicReference r1 = r1.y0
            java.lang.Object r1 = r1.get()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.z53.S(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0035:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x004e
            java.lang.Object r4 = r1.next()
            e52 r4 = (defpackage.e52) r4
            k92 r4 = r4.b
            long r4 = r4.a
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            r3.add(r6)
            goto L_0x0035
        L_0x004e:
            nu5 r1 = r7.Y
            java.lang.String r1 = r1.b
            if (r1 == 0) goto L_0x005c
            if (r8 == 0) goto L_0x005c
            java.util.Set r8 = r8.v0
            java.util.LinkedHashSet r3 = defpackage.bcd.Z(r8, r3)
        L_0x005c:
            nu5 r8 = r7.Y
            kke r8 = r8.o
            w9a r8 = (defpackage.w9a) r8
            nx3 r8 = r8.b()
            eu5 r1 = new eu5
            nu5 r4 = r7.Y
            r5 = 0
            r1.<init>(r3, r4, r5)
            r7.X = r2
            java.lang.Object r8 = defpackage.j47.t0(r8, r1, r7)
            if (r8 != r0) goto L_0x0077
            return r0
        L_0x0077:
            java.util.List r8 = (java.util.List) r8
            nu5 r7 = r7.Y
            s35 r7 = r7.x0
            pt5 r0 = new pt5
            r0.<init>(r8)
            defpackage.pnf.o(r7, r0)
            e5f r7 = defpackage.e5f.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu5.o(java.lang.Object):java.lang.Object");
    }
}
