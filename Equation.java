public class Equation implements RandomNumberGenerator {
    private long a = 1103515245;
    private long c = 12345;
    private long m = (long)Math.pow(2,31);

    private long seed;

   public Equation()
   {
       seed = 5125123;
   }
   public Equation(long a, long c ,long m, long seed)
   {
       this.a = a;
       this.c = c;
       this.m = m;
       this.seed = seed;
   }

   public void setSeed(long seed1)
   {
       this.seed = seed1;
   }
   public long getSeed()
   {
       return this.seed;
   }
   public int nextInt()
   {
       return (int)(seed = (a * seed + c)% m );
   }

   public float nextDouble()
   {
       return (float) (seed = (a * seed + c)% m);
   }
   public double nextGauss()
   {
       return Math.sqrt(-2.0*Math.log(nextDouble())) * Math.cos(2.0*Math.PI*(nextDouble()));
   }
}