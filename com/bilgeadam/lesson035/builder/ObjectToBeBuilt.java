package com.bilgeadam.lesson035.builder;

public class ObjectToBeBuilt
{

	private String mustHave1;
	private String mustHave2;
	private String mustHave3;
	private String optional1;
	private String optional2;
	private String optional3;
	private MustHaveProperty mustHave4;

	
	public ObjectToBeBuilt(ObjectBuilder objectBuilder)
	{
		this.mustHave1 = objectBuilder.mustHave1;
		this.mustHave2 = objectBuilder.mustHave2;
		this.mustHave3 = objectBuilder.mustHave3;
		this.optional1 = objectBuilder.optional1;
		this.optional2 = objectBuilder.optional2;
		this.optional3 = objectBuilder.optional3;
		this.mustHave4 = objectBuilder.mustHave4;
	}

	
	
	public static class ObjectBuilder
	{
		private String mustHave1;
		private String mustHave2;
		private String mustHave3;
		private String optional1;
		private String optional2;
		private String optional3;
		private MustHaveProperty mustHave4;

		public ObjectBuilder(String mustHave1, String mustHave2, String mustHave3, MustHaveProperty mustHave4)
		{
			super();
			this.mustHave1 = mustHave1;
			this.mustHave2 = mustHave2;
			this.mustHave3 = mustHave3;
			this.mustHave4 = mustHave4;
		}
		
		public ObjectBuilder optional1(String optional1)
		{
			this.optional1 = optional1;
			return this;
		}
		
		public ObjectBuilder optional2(String optional2)
		{
			this.optional2 = optional2;
			return this;
		}
		
		public ObjectBuilder optional3(String optional3)
		{
			this.optional3 = optional3;
			return this;
		}
		
		public ObjectToBeBuilt build()
		{
			ObjectToBeBuilt objectToBeBuilt = new ObjectToBeBuilt(this);
			return objectToBeBuilt;
		}
	}



	@Override
	public String toString()
	{
		return "ObjectToBeBuilt [mustHave1=" + this.mustHave1 + ", mustHave2=" + this.mustHave2 + ", mustHave3="
				+ this.mustHave3 + ", optional1=" + this.optional1 + ", optional2=" + this.optional2 + ", optional3="
				+ this.optional3 + ", mustHave4=" + this.mustHave4 + "]";
	}
}
