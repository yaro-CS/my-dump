// Create a class to edit 'Victim'
class EditVictim extends Component {
    submit(var_e){

        // No idea what preventDefault does because of lack of code
        var_e.preventDefault()
      
        // Set the constant variable and assign its
        // propperties to set variables given by the function Victim()
        const newVictim = new Victim()
        newVictim.id = this.props.idFromParent
        newVictim.userName = this.state.username
        newVictim.date = this.state.date
        newVictim.originalMessage = this.state.message
        newVictim.platforms = this.state.platforms


        //this.edit(newVictim)
        this.props.onSave.fetchVictims()
    }

    constructor(props) {

        // I don't know what super does in java/php
        super(props);

            // Construct the website variables to display in vars
            // to use in line 65 to 90
            this.state = {
                username: this.props.usernameFromParent,
                date: this.props.dateFromParent,
                message: this.props.messageFromParent,
                platforms: this.props.platformsFromParent
            }
    }

    edit() {
        
        // add method to the variable (not given as option in line 37)
        const options = {
            method: 'PUT',
        }
    }

    handleInputChange(var_e){

        // Grab the target, value and name from variable e
        // Idk why ya don't do this in 'submit(var_e)'
        const target = var_e.target;
        const value = target.value;
        const name = target.name;
        
        // Set the target name with the value given
        // Probably a name
        this.setState(
            {
                [name]: value
            }
        )


    }

    // Render HTML codee for response I bet
    render() {
        return (
            <div className= 'victim'>
                <form onSubmit={event => this.submit(event)}>

                    <div className="input-field">
                        <input name="username" defaultValue={this.props.usernameFromParent} onChange={this.handleInputChange.bind(this)}/>
                        <label>Username</label>
                    </div>

                    <div className="input-field">
                        <input name="date" defaultValue={this.props.dateFromParent} onChange={this.handleInputChange.bind(this)}/>
                        <label>Date</label>
                    </div>

                    <div className="input-field">
                        <input name="message" defaultValue={this.props.messageFromParent} onChange={this.handleInputChange.bind(this)}/>
                        <label>Message</label>
                    </div>

                    <div className="input-field">
                        <input name="platforms" defaultValue={this.props.platformsFromParent} onChange={this.handleInputChange.bind(this)}/>
                        <label>Platforms</label>
                    </div>

                    <input type="submit" value="Save"/>
                </form>
            </div>
        )
    }

    // This would look better since all classNames are input-field
    // render() {
    //     return (
    //         <div className= 'victim'>
    //             <form onSubmit={event => this.submit(event)}>

    //                 <div className="input-field">
    //                     <input name="username" defaultValue={this.props.usernameFromParent} onChange={this.handleInputChange.bind(this)}/>
    //                     <label>Username</label>

    //                     <input name="date" defaultValue={this.props.dateFromParent} onChange={this.handleInputChange.bind(this)}/>
    //                     <label>Date</label>

    //                     <input name="message" defaultValue={this.props.messageFromParent} onChange={this.handleInputChange.bind(this)}/>
    //                     <label>Message</label>

    //                     <input name="platforms" defaultValue={this.props.platformsFromParent} onChange={this.handleInputChange.bind(this)}/>
    //                     <label>Platforms</label>
    //                 </div>

    //                 <input type="submit" value="Save"/>
    //             </form>
    //         </div>
    //     )
    // }
}

export default EditVictim;