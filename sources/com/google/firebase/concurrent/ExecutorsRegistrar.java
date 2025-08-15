package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {
    static final le7 BG_EXECUTOR = new le7(new dc3(1));
    static final le7 BLOCKING_EXECUTOR = new le7(new dc3(3));
    static final le7 LITE_EXECUTOR = new le7(new dc3(2));
    static final le7 SCHEDULER = new le7(new dc3(4));

    private static StrictMode.ThreadPolicy bgPolicy() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        detectNetwork.detectResourceMismatches();
        detectNetwork.detectUnbufferedIo();
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory factory(String str, int i) {
        return new u04(str, i, (StrictMode.ThreadPolicy) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$4(zb3 zb3) {
        return (ScheduledExecutorService) BG_EXECUTOR.get();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$5(zb3 zb3) {
        return (ScheduledExecutorService) BLOCKING_EXECUTOR.get();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$6(zb3 zb3) {
        return (ScheduledExecutorService) LITE_EXECUTOR.get();
    }

    private static StrictMode.ThreadPolicy litePolicy() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* access modifiers changed from: private */
    public static ScheduledExecutorService scheduled(ExecutorService executorService) {
        return new ah4(executorService, (ScheduledExecutorService) SCHEDULER.get());
    }

    public List<nb3> getComponents() {
        Class<le0> cls = le0.class;
        Class<ScheduledExecutorService> cls2 = ScheduledExecutorService.class;
        lqb lqb = new lqb(cls, cls2);
        Class<ExecutorService> cls3 = ExecutorService.class;
        Class<Executor> cls4 = Executor.class;
        lqb[] lqbArr = {new lqb(cls, cls3), new lqb(cls, cls4)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(lqb);
        for (lqb h : lqbArr) {
            a14.h(h, "Null interface");
        }
        Collections.addAll(hashSet, lqbArr);
        nb3 nb3 = new nb3((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ta4(11), hashSet3);
        Class<ip0> cls5 = ip0.class;
        lqb lqb2 = new lqb(cls5, cls2);
        lqb[] lqbArr2 = {new lqb(cls5, cls3), new lqb(cls5, cls4)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(lqb2);
        for (lqb h2 : lqbArr2) {
            a14.h(h2, "Null interface");
        }
        Collections.addAll(hashSet4, lqbArr2);
        nb3 nb32 = new nb3((String) null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new ta4(12), hashSet6);
        Class<kh7> cls6 = kh7.class;
        lqb lqb3 = new lqb(cls6, cls2);
        lqb[] lqbArr3 = {new lqb(cls6, cls3), new lqb(cls6, cls4)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(lqb3);
        for (lqb h3 : lqbArr3) {
            a14.h(h3, "Null interface");
        }
        Collections.addAll(hashSet7, lqbArr3);
        nb3 nb33 = new nb3((String) null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new ta4(13), hashSet9);
        ob8 a = nb3.a(new lqb(u4f.class, cls4));
        a.f = new ta4(14);
        return Arrays.asList(new nb3[]{nb3, nb32, nb33, a.b()});
    }

    private static ThreadFactory factory(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new u04(str, i, threadPolicy);
    }
}
