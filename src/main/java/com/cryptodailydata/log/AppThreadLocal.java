package com.cryptodailydata.log;

/**
 * @author Serhat Akdeniz
 */
public class AppThreadLocal
{

    public static final ThreadLocal<AppRequestContext> ohThreadLocal = new ThreadLocal<AppRequestContext>();

    public static void set(AppRequestContext context)
    {
        ohThreadLocal.set(context);
    }

    public static void unset()
    {
        ohThreadLocal.remove();
    }

    public static AppRequestContext safeGet()
    {
        AppRequestContext context = ohThreadLocal.get();
        if (context != null)
        {
            return context;
        }
        else
        {
            context = new AppRequestContext();
            set(context);
            return context;
        }
    }

    public static AppRequestContext get()
    {
        return ohThreadLocal.get();
    }
}