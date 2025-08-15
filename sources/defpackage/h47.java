package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* renamed from: h47  reason: default package */
public final class h47 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k56 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h47(k56 k56, Continuation continuation) {
        super(2, continuation);
        this.Y = k56;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h47) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        h47 h47 = new h47(this.Y, continuation);
        h47.X = obj;
        return h47;
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
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:205)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
    public final java.lang.Object o(java.lang.Object r4) {
        /*
            r3 = this;
            defpackage.od2.a0(r4)
            java.lang.Object r4 = r3.X
            sx3 r4 = (defpackage.sx3) r4
            lx3 r4 = r4.getCoroutineContext()
            k56 r3 = r3.Y
            wse r0 = new wse     // Catch:{ InterruptedException -> 0x0040 }
            r0.<init>()     // Catch:{ InterruptedException -> 0x0040 }
            x77 r4 = defpackage.pag.n(r4)     // Catch:{ InterruptedException -> 0x0040 }
            r1 = 1
            cm4 r4 = defpackage.pag.q(r4, r1, r0)     // Catch:{ InterruptedException -> 0x0040 }
            r0.c = r4     // Catch:{ InterruptedException -> 0x0040 }
        L_0x001d:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.wse.o     // Catch:{ InterruptedException -> 0x0040 }
            int r1 = r4.get(r0)     // Catch:{ InterruptedException -> 0x0040 }
            if (r1 == 0) goto L_0x0031
            r4 = 2
            if (r1 == r4) goto L_0x0038
            r4 = 3
            if (r1 != r4) goto L_0x002c
            goto L_0x0038
        L_0x002c:
            defpackage.wse.f(r1)     // Catch:{ InterruptedException -> 0x0040 }
            r3 = 0
            throw r3     // Catch:{ InterruptedException -> 0x0040 }
        L_0x0031:
            r2 = 0
            boolean r4 = r4.compareAndSet(r0, r1, r2)     // Catch:{ InterruptedException -> 0x0040 }
            if (r4 == 0) goto L_0x001d
        L_0x0038:
            java.lang.Object r3 = r3.invoke()     // Catch:{ all -> 0x0042 }
            r0.e()     // Catch:{ InterruptedException -> 0x0040 }
            return r3
        L_0x0040:
            r3 = move-exception
            goto L_0x0047
        L_0x0042:
            r3 = move-exception
            r0.e()     // Catch:{ InterruptedException -> 0x0040 }
            throw r3     // Catch:{ InterruptedException -> 0x0040 }
        L_0x0047:
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Blocking call was interrupted due to parent cancellation"
            r4.<init>(r0)
            java.lang.Throwable r3 = r4.initCause(r3)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h47.o(java.lang.Object):java.lang.Object");
    }
}
