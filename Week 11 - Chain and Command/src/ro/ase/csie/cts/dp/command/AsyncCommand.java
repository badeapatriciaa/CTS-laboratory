package ro.ase.csie.cts.dp.command;

public class AsyncCommand extends AsyncTask {
	
	String taskName;
	GameModuleInterface module = null;

		
	public AsyncCommand(String taskName, GameModuleInterface module) {
		super();
		this.taskName = taskName;
		this.module = module;
	}

	
	@Override
	public void asyncExecute() {
		this.module.doTask(taskName);
	}

}
